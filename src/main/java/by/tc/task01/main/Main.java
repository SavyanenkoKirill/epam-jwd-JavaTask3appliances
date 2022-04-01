package main.java.by.tc.task01.main;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.entity.criteria.SearchCriteria;
import main.java.by.tc.task01.service.ApplianceService;
import main.java.by.tc.task01.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			List<Appliance> appliances;

			ServiceFactory factory = ServiceFactory.getInstance();
			ApplianceService service = factory.getApplianceService();

			Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
			criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33.0);
			appliances = service.find(criteriaOven);


			ApplianceInfoPrinter.printToConsole(appliances);

			criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
			criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45.0);
			criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60.0);

			appliances = service.find(criteriaOven);
			ApplianceInfoPrinter.printToConsole(appliances);

			Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
			criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
			criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14.0);
			criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4.0);

			appliances = service.find(criteriaOven);
			ApplianceInfoPrinter.printToConsole(appliances);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
