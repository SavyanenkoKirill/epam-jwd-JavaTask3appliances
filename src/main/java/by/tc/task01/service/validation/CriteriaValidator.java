package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class CriteriaValidator {
	private static final String OUTER_CLASS_FULL_NAME = "main.java.by.tc.task01.entity.criteria.SearchCriteria";

    private CriteriaValidator() {}

    public static boolean validateCriteria(Criteria criteria) {
        try {
            String groupSearchName = criteria.getGroupSearchName();
            Set<String> attributes = criteria.getCriteria().keySet();
            List<String> enumConstants = Arrays.stream(Class.forName(OUTER_CLASS_FULL_NAME + "$" + groupSearchName).getEnumConstants())
                    .map(Object::toString)
                    .collect(Collectors.toList());
            return enumConstants.containsAll(attributes);
        } catch (ClassNotFoundException exception) {
            return false;
        }
    }
}