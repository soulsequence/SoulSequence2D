package soulsequence.portfolio.stats;

public class StatModifier {
    private final int Order;
    private final float Value;
    private final StatModType Type;
    public StatModifier(float value, StatModType type, int order){
        Order = order;
        Value = value;
        Type = type;
    }

    public int getOrder() {
        return Order;
    }

    public float getValue() {
        return Value;
    }

    public StatModType getType() {
        return Type;
    }

    public StatModifier(float value, StatModType type){
        this(value, type, type.ordinal());
    }
}
