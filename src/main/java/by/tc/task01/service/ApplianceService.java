package main.java.by.tc.task01.service;


import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {
	
	List<Appliance> find(Criteria criteria) throws IOException;
	
}
