package main.java.by.tc.task01.main;

import main.java.by.tc.task01.entity.Appliance;

import java.util.List;

public final class ApplianceInfoPrinter {
	private ApplianceInfoPrinter() {}

	public static void printToConsole(List<Appliance> appliances) {
		if (appliances.isEmpty()) {
			System.out.println("Appliance list is empty");
		} else {
			appliances.forEach(System.out::println);
		}
	}
}
