package main.java.by.tc.task01.entity.criteria;

import main.java.by.tc.task01.entity.Appliance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public boolean matchesAppliance(Appliance appliance) {
        if (!appliance.getClass().getSimpleName().equals(groupSearchName)) {
            return false;
        }
        Map<String, Object> characteristics = appliance.getCharacteristics();
        return criteria.entrySet().stream()
                .allMatch(searchEntry -> characteristics.get(searchEntry.getKey()).equals(searchEntry.getValue()));
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value instanceof Integer ? ((Integer) value).doubleValue() : value);
    }

    public void remove(String key) {
        criteria.remove(key);
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

}
