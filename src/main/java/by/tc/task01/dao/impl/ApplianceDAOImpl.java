package main.java.by.tc.task01.dao.impl;

import main.java.by.tc.task01.dao.ApplianceDAO;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.service.parser.ApplianceParser;
import main.java.by.tc.task01.service.reader.ApplianceBaseReader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {
    //private static final String APPLIANCES_DATABASE_FILEPATH = "src/main/resources/appliances_db.txt";
/*    private final String APPLIANCES_DATABASE_FILEPATH = Objects.requireNonNull(getClass().getClassLoader()
            .getResource( " appliances_db.txt")).getPath();*/
    private final String APPLIANCES_DATABASE_FILEPATH = new File("resources/appliances_db.txt").getAbsolutePath();

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        List<String> applianceLines = ApplianceBaseReader.readApplianceBase(APPLIANCES_DATABASE_FILEPATH);
        List<Appliance> appliances = applianceLines.stream()
                .map(ApplianceParser::parseApplianceLine)
                .collect(Collectors.toList());
        return appliances.stream()
                .filter(criteria::matchesAppliance)
                .collect(Collectors.toList());
    }
}