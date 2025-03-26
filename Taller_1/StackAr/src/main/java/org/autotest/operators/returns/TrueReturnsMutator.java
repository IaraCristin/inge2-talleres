package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#TRUE_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por true.
 */
public class TrueReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // COMPLETAR
        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn)candidate;
        String type = getReturnedExpressionType(op);
        List<String> targetTypes = Arrays.asList(
                "boolean"
        );

        if (!targetTypes.contains(type)) {
            return false;
        }

        if (!Objects.equals(op.toString(), "return true")) {
            return true;
        }

        return false;
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    @Override
    public void process(CtElement candidate) {
        // COMPLETAR
        CtReturn op = (CtReturn)candidate;
        op.setReturnedExpression(getTrueValueForReturnExpression(op));
    }

    private CtExpression getTrueValueForReturnExpression(CtReturn op) {
        return op.getFactory().Code().createLiteral(true);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        // COMPLETAR
        CtReturn op = (CtReturn)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por " + getTrueValueForReturnExpression(op).toString() +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
