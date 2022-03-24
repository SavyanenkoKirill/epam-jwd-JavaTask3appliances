package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.Extensional;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven extends Extensional {
    private double capacity;
    private double depth;

    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("POWER_CONSUMPTION", getPowerConsumption());
        characteristics.put("WEIGHT", getWeight());
        characteristics.put("CAPACITY", capacity);
        characteristics.put("DEPTH", depth);
        characteristics.put("HEIGHT", getHeight());
        characteristics.put("WIDTH", getWidth());
        return characteristics;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.capacity, capacity) == 0 && Double.compare(oven.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, depth);
    }
}
