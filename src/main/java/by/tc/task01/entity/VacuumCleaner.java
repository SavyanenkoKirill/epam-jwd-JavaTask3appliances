package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.PowerConsuming;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends PowerConsuming {
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(double powerConsumption, String filterType, String bagType,
                         String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("POWER_CONSUMPTION", getPowerConsumption());
        characteristics.put("FILTER_TYPE", filterType);
        characteristics.put("BAG_TYPE", bagType);
        characteristics.put("WAND_TYPE", wandType);
        characteristics.put("MOTOR_SPEED_REGULATION", motorSpeedRegulation);
        characteristics.put("CLEANING_WIDTH", cleaningWidth);
        return characteristics;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 && Double.compare(that.cleaningWidth, cleaningWidth) == 0 && Objects.equals(filterType, that.filterType) && Objects.equals(bagType, that.bagType) && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
