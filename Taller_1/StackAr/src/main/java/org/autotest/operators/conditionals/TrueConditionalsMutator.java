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

        if (!(candidate instanceof CtBinaryOperator)) {
            return false;
        }

        CtBinaryOperator op = (CtBinaryOperator)candidate;
        List<BinaryOperatorKind> targetOperations = Arrays.asList(
                BinaryOperatorKind.EQ, // ==
                BinaryOperatorKind.NE // !=
        );
        return targetOperations.contains(op.getKind());
    }

    @Override
    public void process(CtElement candidate) {

        CtLiteral<Boolean> trueLiteral = candidate.getFactory().createLiteral(true);
        candidate.replace(trueLiteral);

    }

    @Override
    public String describeMutation(CtElement candidate) {

        CtBinaryOperator op = (CtBinaryOperator)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                BinaryOperatorKindToString.get(op.getKind()) + " por true" +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
