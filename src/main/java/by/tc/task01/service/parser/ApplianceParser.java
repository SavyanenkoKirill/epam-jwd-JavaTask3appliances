package main.java.by.tc.task01.service.parser;

import main.java.by.tc.task01.entity.*;

public final class ApplianceParser {
    public static final String CHARACTERISTICS_AND_VALUES = "[ :,=]+";

    private ApplianceParser() {}

    public static Appliance parseApplianceLine(String line) {
        Appliance appliance = null;
        String[] tokens = line.split(CHARACTERISTICS_AND_VALUES);
        String applianceName = tokens[0];
        switch (applianceName) {
            case "Oven" -> appliance = new Oven(Double.parseDouble(tokens[2]), Double.parseDouble(tokens[4]),
                    Double.parseDouble(tokens[6]), Double.parseDouble(tokens[8]), Double.parseDouble(tokens[10]),
                    Double.parseDouble(tokens[12]));
            case "Laptop" -> appliance = new Laptop(Double.parseDouble(tokens[2]), tokens[4], Double.parseDouble(tokens[6]),
                    Double.parseDouble(tokens[8]), Double.parseDouble(tokens[10]),
                    Double.parseDouble(tokens[12]));
            case "Refrigerator" -> appliance = new Refrigerator(Double.parseDouble(tokens[2]), Double.parseDouble(tokens[4]),
                    Double.parseDouble(tokens[6]), Double.parseDouble(tokens[8]),
                    Double.parseDouble(tokens[10]), Double.parseDouble(tokens[12]));
            case "VacuumCleaner" -> appliance = new VacuumCleaner(Double.parseDouble(tokens[2]), tokens[4], tokens[6], tokens[8],
                    Double.parseDouble(tokens[10]), Double.parseDouble(tokens[12]));
            case "TabletPC" -> appliance = new TabletPC(Double.parseDouble(tokens[2]), Double.parseDouble(tokens[4]),
                    Double.parseDouble(tokens[6]), Double.parseDouble(tokens[8]), tokens[10]);
            case "Speakers" -> {
                String[] frequencyRangeBounds = tokens[6].split("-");
                appliance = new Speakers(Double.parseDouble(tokens[2]), Integer.parseInt(tokens[4]),
                        Double.parseDouble(frequencyRangeBounds[0]), Double.parseDouble(frequencyRangeBounds[1]), Double.parseDouble(tokens[8]));
            }
        }
        return appliance;
    }
}
