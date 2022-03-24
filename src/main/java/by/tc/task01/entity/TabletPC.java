package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.Computer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC extends Computer {
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(double batteryCapacity, double displayInches, double memoryROM,
                    double flashMemoryCapacity, String color) {
        super(batteryCapacity, memoryROM, displayInches);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("BATTERY_CAPACITY", getBatteryCapacity());
        characteristics.put("DISPLAY_INCHES", getDisplayInches());
        characteristics.put("MEMORY_ROM", getMemoryRom());
        characteristics.put("FLASH_MEMORY_CAPACITY", flashMemoryCapacity);
        characteristics.put("COLOR", color);
        return characteristics;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0 && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flashMemoryCapacity, color);
    }
}
