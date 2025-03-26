package org.autotest.operators.conditionals;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {

        if (!(candidate instanceof CtIf)) {
            return false;
        }

        CtIf op = (CtIf) candidate;
        List<BinaryOperatorKind> targetOperations = Arrays.asList(
                BinaryOperatorKind.EQ, // ==
                BinaryOperatorKind.NE // !=
        );

        //Primero nos fijamos que el condicional sea un operador binario y luego nos fijamos de qué tipo
        return  op.getCondition() instanceof CtBinaryOperator &&
                targetOperations.contains(((CtBinaryOperator) op.getCondition()).getKind());
    }

    @Override
    public void process(CtElement candidate) {

        CtIf op = (CtIf)candidate;
        op.setCondition(op.getFactory().Code().createLiteral(true));
    }

    @Override
    public String describeMutation(CtElement candidate) {

        CtIf op = (CtIf)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                BinaryOperatorKindToString.get(((CtBinaryOperator) op.getCondition()).getKind()) + " por true" +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
