package main.java.by.tc.task01.entity;

import java.io.Serializable;
import java.util.Map;

public abstract class Appliance implements Serializable {
    public abstract Map<String, Object> getCharacteristics();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{ | ");
        for (Map.Entry<String, Object> characteristicEntry : getCharacteristics().entrySet()) {
            sb.append(characteristicEntry.getKey()).append("=").append(characteristicEntry.getValue()).append(" | ");
        }
        sb.append("}");
        return sb.toString();
    }

}
