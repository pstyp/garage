package main;

import automotives.Car;
import garage.Garage;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Car myCar = new Car("BMW", "Blue", 4, 5);
		
		garage.addVehicle(myCar);
		System.out.println(garage.calculateCostByID(1));
		garage.fixVehicleByID(1);
		
		
	}
}
