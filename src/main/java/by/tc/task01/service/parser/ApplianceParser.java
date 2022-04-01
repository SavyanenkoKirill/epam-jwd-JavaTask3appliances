package main.java.by.tc.task01.service.parser;

import main.java.by.tc.task01.entity.*;

import java.security.InvalidParameterException;

public final class ApplianceParser {
    public static final String CHARACTERISTICS_AND_VALUES = "[ :,=]+";
    public static final String FREQUENCY_RANGE_DELIMITER = "-";

    private ApplianceParser() {}

    public static Appliance parseApplianceLine(String line) {
        Appliance appliance;
        String[] appTokens = line.split(CHARACTERISTICS_AND_VALUES);
        String applianceName = appTokens[0];
        switch (applianceName) {
            case "Oven" -> appliance = new Oven(Double.parseDouble(appTokens[2]), Double.parseDouble(appTokens[4]),
                    Double.parseDouble(appTokens[6]), Double.parseDouble(appTokens[8]), Double.parseDouble(appTokens[10]),
                    Double.parseDouble(appTokens[12]));
            case "Laptop" -> appliance = new Laptop(Double.parseDouble(appTokens[2]), appTokens[4], Double.parseDouble(appTokens[6]),
                    Double.parseDouble(appTokens[8]), Double.parseDouble(appTokens[10]),
                    Double.parseDouble(appTokens[12]));
            case "Refrigerator" -> appliance = new Refrigerator(Double.parseDouble(appTokens[2]), Double.parseDouble(appTokens[4]),
                    Double.parseDouble(appTokens[6]), Double.parseDouble(appTokens[8]),
                    Double.parseDouble(appTokens[10]), Double.parseDouble(appTokens[12]));
            case "VacuumCleaner" -> appliance = new VacuumCleaner(Double.parseDouble(appTokens[2]), appTokens[4], appTokens[6], appTokens[8],
                    Double.parseDouble(appTokens[10]), Double.parseDouble(appTokens[12]));
            case "TabletPC" -> appliance = new TabletPC(Double.parseDouble(appTokens[2]), Double.parseDouble(appTokens[4]),
                    Double.parseDouble(appTokens[6]), Double.parseDouble(appTokens[8]), appTokens[10]);
            case "Speakers" -> {
                String[] frequencyRangeBounds = appTokens[6].split(FREQUENCY_RANGE_DELIMITER);
                appliance = new Speakers(Double.parseDouble(appTokens[2]), Integer.parseInt(appTokens[4]),
                        Double.parseDouble(frequencyRangeBounds[0]), Double.parseDouble(frequencyRangeBounds[1]), Double.parseDouble(appTokens[8]));
            }
            default -> throw new InvalidParameterException("Invalid appliance info line:\n" + line);
        }
        return appliance;
    }
}
