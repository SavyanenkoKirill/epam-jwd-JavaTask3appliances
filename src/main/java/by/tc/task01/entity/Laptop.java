package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.Computer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Laptop extends Computer {
    private String operatingSystem;
    private double systemMemory;
    private double cpu;

    public Laptop(double batteryCapacity, String operatingSystem,
                  double memoryROM, double systemMemory, double CPU, double displayInches) {
        super(batteryCapacity, memoryROM, displayInches);
        this.operatingSystem = operatingSystem;
        this.systemMemory = systemMemory;
        this.cpu = CPU;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("BATTERY_CAPACITY", getBatteryCapacity());
        characteristics.put("OS", operatingSystem);
        characteristics.put("MEMORY_ROM", getMemoryRom());
        characteristics.put("SYSTEM_MEMORY", systemMemory);
        characteristics.put("CPU", cpu);
        characteristics.put("DISPLAY_INCHES", getDisplayInches());
        return characteristics;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.systemMemory, systemMemory) == 0 && Double.compare(laptop.cpu, cpu) == 0 && Objects.equals(operatingSystem, laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystem, systemMemory, cpu);
    }
}
