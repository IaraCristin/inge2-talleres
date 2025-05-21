package at.dataflow.zeroanalysis;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is positive.
     */
    POSITIVE("positive"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable is negative.
     */
    NEGATIVE("negative"),

    /**
     * The variable is top (can be any value).
     */
    TOP("top");


    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        switch (this){
            case ZERO: return another;
            case POSITIVE:
                switch (another) {
                    case ZERO: return POSITIVE;
                    case POSITIVE: return POSITIVE;
                    case NEGATIVE: return TOP;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case NEGATIVE:
                switch (another) {
                    case ZERO: return NEGATIVE;
                    case POSITIVE: return TOP;
                    case NEGATIVE: return NEGATIVE;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case TOP:
                switch (another) {
                    case BOTTOM: return BOTTOM;
                    default: return TOP;
                }
            default: return BOTTOM;
        }
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        switch (this){
            case ZERO:
                switch (another) {
                    case ZERO: return BOTTOM;
                    case POSITIVE: return ZERO;
                    case NEGATIVE: return ZERO;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case POSITIVE:
                switch (another) {
                    case ZERO: return BOTTOM;
                    case POSITIVE: return TOP;
                    case NEGATIVE: return TOP;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case NEGATIVE:
                switch (another) {
                    case ZERO: return BOTTOM;
                    case POSITIVE: return TOP;
                    case NEGATIVE: return TOP;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case TOP:
                switch (another) {
                    case BOTTOM: return BOTTOM;
                    case ZERO: return BOTTOM;
                    default: return TOP;
                }
            default: return BOTTOM;
        }
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        switch (this){
            case ZERO:
                switch (another) {
                    case BOTTOM: return BOTTOM;
                    default: return ZERO;
                }
            case POSITIVE: return another;
            case NEGATIVE:
                switch (another) {
                    case ZERO: return ZERO;
                    case POSITIVE: return NEGATIVE;
                    case NEGATIVE: return POSITIVE;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case TOP:
                switch (another) {
                    case ZERO: return ZERO;
                    case BOTTOM: return BOTTOM;
                    default: return TOP;
                }
            default: return BOTTOM;
        }
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue substract(ZeroAbstractValue another) {
        switch (this){
            case ZERO:
                switch (another) {
                    case ZERO: return ZERO;
                    case POSITIVE: return NEGATIVE;
                    case NEGATIVE: return POSITIVE;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case POSITIVE:
                switch (another) {
                    case ZERO: return POSITIVE;
                    case POSITIVE: return TOP;
                    case NEGATIVE: return POSITIVE;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case NEGATIVE:
                switch (another) {
                    case ZERO: return NEGATIVE;
                    case POSITIVE: return NEGATIVE;
                    case NEGATIVE: return TOP;
                    case TOP: return TOP;
                    case BOTTOM: return BOTTOM;
                }
            case TOP:
                switch (another) {
                    case BOTTOM: return BOTTOM;
                    default: return TOP;
                }
            default: return BOTTOM;
        }
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */

    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        switch (this){
            case ZERO:
                switch (another) {
                    case ZERO: return ZERO;
                    case BOTTOM: return ZERO;
                    default: return TOP;
                }
            case TOP: return TOP;
            case POSITIVE:
                switch (another) {
                    case POSITIVE: return POSITIVE;
                    case BOTTOM: return POSITIVE;
                    default: return TOP;
                }
            case NEGATIVE:
                switch (another) {
                    case NEGATIVE: return NEGATIVE;
                    case BOTTOM: return NEGATIVE;
                    default: return TOP;
                }

            default: return another;
        }
    }

}
