package test.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.entity.criteria.SearchCriteria;
import main.java.by.tc.task01.service.validation.CriteriaValidator;
import org.junit.jupiter.api.Assertions;

class CriteriaValidatorTest {

    @org.junit.jupiter.api.Test
    void testIfCriteriaCharacteristicsAreValid() {
        Criteria criteria = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteria.add(SearchCriteria.Laptop.DISPLAY_INCHES.toString(), 33);
        boolean actualValidity = CriteriaValidator.validateCriteria(criteria);
        Assertions.assertFalse(actualValidity);
    }
}