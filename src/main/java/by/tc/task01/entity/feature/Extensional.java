package main.java.by.tc.task01.entity.feature;

import java.util.Objects;

public abstract class Extensional extends PowerConsuming {
    private double weight;
    private double height;
    private double width;

    public Extensional(double powerConsumption, double weight, double height, double width) {
        super(powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extensional that = (Extensional) o;
        return Double.compare(that.weight, weight) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, width);
    }
}
