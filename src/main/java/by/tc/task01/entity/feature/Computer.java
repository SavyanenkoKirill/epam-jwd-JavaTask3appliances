package main.java.by.tc.task01.entity.feature;

import main.java.by.tc.task01.entity.Appliance;

import java.util.Objects;

public abstract class Computer extends Appliance {
    private double batteryCapacity;
    private double memoryRom;
    private double displayInches;

    public Computer(double batteryCapacity, double memoryROM, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryROM;
        this.displayInches = displayInches;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.batteryCapacity, batteryCapacity) == 0 && Double.compare(computer.memoryRom, memoryRom) == 0 && Double.compare(computer.displayInches, displayInches) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, memoryRom, displayInches);
    }
}
