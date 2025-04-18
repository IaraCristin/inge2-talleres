package org.autotest.operators.constants;

import org.autotest.helpers.UnaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#EXPERIMENTAL_CRCR
 *
 * Este operador reemplaza los valores de las constantes por uno.
 */
public class OneConstantMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {

        if (candidate instanceof CtUnaryOperator) {
            CtUnaryOperator op = (CtUnaryOperator)candidate;
            if (!(op.getKind() == UnaryOperatorKind.NEG && op.getOperand() instanceof CtLiteral)) {
                return false;
            }
        } else if (!(candidate instanceof CtLiteral)) {
            return false;
        }


        if (candidate instanceof CtUnaryOperator) {
            CtUnaryOperator op = (CtUnaryOperator) candidate;
            CtLiteral operand = (CtLiteral) op.getOperand();

            String type = getLiteralType(operand);
            List<String> targetTypes = Arrays.asList(
                    "int"
            );

            if (!targetTypes.contains(type)) {
                return false;
            }

            return true;


        } else {
            CtLiteral op = (CtLiteral)candidate;

            String type = getLiteralType(op);
            List<String> targetTypes = Arrays.asList(
                    "int"
            );

            if (!targetTypes.contains(type)) {
                return false;
            }

            String parentNodeCode = op.getParent().toString();
            // No usamos op.getValue().toString() para obtener el valor del literal sino que miramos el parent porque
            // Spoon separa los literales negativos en dos nodos: el operador de negación y el literal.

            if ((Objects.equals(op.getValue().toString(), "1")) || parentNodeCode.contains("-")) {
                // Para evitar generar mutantes inválidos, ignoramos los literales que ya son 1
                //Y como a los negativos los debería captar el CtUnaryOperator, evitamos esos también
                return false;
            }

            return true;
        }

    }

    @Override
    public void process(CtElement candidate) {

        if (candidate instanceof CtUnaryOperator) {
            CtUnaryOperator op = (CtUnaryOperator)candidate;
            CtLiteral newLiteral = op.getFactory().Code().createLiteral(1);
            op.setOperand(newLiteral);
            op.setKind(UnaryOperatorKind.POS);
        } else {
            CtLiteral op = (CtLiteral)candidate;
            op.setValue(op.getFactory().Code().createLiteral(1));
        }

    }

    private static String getLiteralType(CtLiteral op) {
        return op.getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtLiteral op;

        if (candidate instanceof CtUnaryOperator) {
            op = (CtLiteral) ((CtUnaryOperator) candidate).getOperand();
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    "-" + op.getValue().toString() + " por 1" +
                    " en la línea " + op.getPosition().getLine() + ".";
        } else {
            op = (CtLiteral) candidate;
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    op.getValue().toString() + " por 1" +
                    " en la línea " + op.getPosition().getLine() + ".";
        }
    }
}
