package soulsequence.portfolio.stats;

import java.util.ArrayList;
import java.util.List;

public class CharacterStat {
    private boolean isDirty = true;
    private float _value;
    private float baseValue;

    private final List<StatModifier> statModifiers;

    public CharacterStat(float baseValue) {
        statModifiers = new ArrayList<StatModifier>();
    }

    public float getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(float baseValue) {
        this.baseValue = baseValue;
        isDirty = true;
    }

    public float getCalculatedValue() {
        if(isDirty) {
            _value = calculateFinalValue();
            isDirty = false;
        }
        return _value;
    }

    public void addModifier(StatModifier mod) {
        if (mod == null) { throw new IllegalArgumentException("Modifier cannot be null."); }
        isDirty = true;
        statModifiers.add(mod);
        statModifiers.sort(this::compareModifierOrder);
    }

    public boolean removeModifier(StatModifier mod) {
        if (mod == null) { throw new IllegalArgumentException("Modifier cannot be null."); }
        isDirty = true;
        return statModifiers.remove(mod);
    }

    private int compareModifierOrder(StatModifier a, StatModifier b) {
        return Integer.compare(a.getOrder(), b.getOrder());
    }

    private float calculateFinalValue()
    {
        float finalValue = baseValue;

        for (StatModifier statModifier : statModifiers) {
            if (statModifier.getType() == StatModType.Flat) {
                finalValue += statModifier.getValue();
            }
            else if (statModifier.getType() == StatModType.Percent) {
                finalValue *= 1 + statModifier.getValue();
            }
        }
        // TODO: examine how this interacts with the final values.
        return (float) Math.round(finalValue * 10000) / 10000;
    }
}
