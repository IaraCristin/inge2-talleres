package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processCopy(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processStore(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processLoad(stmt);
        }
    }

    private void processNewObject(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        //Obtenemos el numero de línea y lo guardamos en el nodo nodeName
        Node nodeName = pointsToGraph.getNodeName(stmt);

        Set<Node> set = new HashSet<>();
        set.add(nodeName);

        //Relacionamos la variable "leftVariable" al nodo obtenido
        pointsToGraph.setNodesForVariable(leftVariableName, set);
    }

    private void processCopy(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        //Seteamos los nodos relacionado a la variable "rightVariableName" a la variable "leftVariableName"
        pointsToGraph.setNodesForVariable(leftVariableName, pointsToGraph.getNodesForVariable(rightVariableName));
    }

    private void processStore(AssignStmt stmt) { // x.f = y
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        //Agregamos aristas que van desde los nodos relacionados a la variable izquierda con los nodos relacionados a la variable derecha
        for(Node leftNode : pointsToGraph.getNodesForVariable(leftVariableName)) {
            for(Node rightNode : pointsToGraph.getNodesForVariable(rightVariableName)){
                pointsToGraph.addEdge(leftNode, fieldName, rightNode);
            }
        }

    }

    private void processLoad(AssignStmt stmt) { // x = y.f
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        Set<Node> everyNode = new HashSet<>();
        // por cada nodo que es apuntado por un nodo apuntado por y (rightVariableName), a traves del campo f (fieldName),
        // lo añado al set de nodos apuntados por x (leftVariableName), sobreescribiendo los nodos apuntados por x anteriormente
        for (Node rightNode : pointsToGraph.getNodesForVariable(rightVariableName)) {
            Set<Node> set = pointsToGraph.getReachableNodesByField(rightNode, fieldName);
            everyNode.addAll(set);
        }

        pointsToGraph.setNodesForVariable(leftVariableName, everyNode);
    }
}
