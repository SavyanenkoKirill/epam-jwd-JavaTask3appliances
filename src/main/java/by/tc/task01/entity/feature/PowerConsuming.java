package main.java.by.tc.task01.entity.feature;

import main.java.by.tc.task01.entity.Appliance;

import java.util.Objects;

public abstract class PowerConsuming extends Appliance {
    private double powerConsumption;

    public PowerConsuming(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PowerConsuming that = (PowerConsuming) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption);
    }
}
