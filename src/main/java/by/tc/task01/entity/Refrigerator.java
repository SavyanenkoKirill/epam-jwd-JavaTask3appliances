package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.Extensional;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Extensional {
    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator(double powerConsumption, double weight, double freezerCapacity,
                        double overallCapacity, double height, double width) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("POWER_CONSUMPTION", getPowerConsumption());
        characteristics.put("WEIGHT", getWeight());
        characteristics.put("FREEZER_CAPACITY", freezerCapacity);
        characteristics.put("OVERALL_CAPACITY", overallCapacity);
        characteristics.put("HEIGHT", getHeight());
        characteristics.put("WIDTH", getWidth());
        return characteristics;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.freezerCapacity, freezerCapacity) == 0 && Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freezerCapacity, overallCapacity);
    }
}
