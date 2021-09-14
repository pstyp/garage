package menu;

import automotives.Car;
import automotives.Motorbike;
import automotives.Truck;
import garage.Garage;
import utils.UserInput;

public class CarMenu {

	private UserInput scan;
	private Garage garage;
	
	public CarMenu() {
		scan = UserInput.getInstance();
		garage = Garage.getInstance();
	}
	
	public CarMenu(UserInput scan, Garage garage) {
		this.scan = scan;
		this.garage = garage;
	}

	public void createCar() {
		System.out.println("Manufacturer?");
		String maker = scan.getString();

		System.out.println("Colour?");
		String colour = scan.getString();

		System.out.println("How many wheels?");
		int wheels = scan.getInt();

		System.out.println("How many doors?");
		int doors = scan.getInt();

		Car userCar = new Car(maker, colour, wheels, doors);
		garage.addVehicle(userCar);
	}
	public void createTruck() {
		System.out.println("Manufacturer?");
		String maker = scan.getString();

		System.out.println("Colour?");
		String colour = scan.getString();

		System.out.println("Capacity?");
		int capacity = scan.getInt();

		System.out.println("Height?");
		double height = scan.getDouble();

		Truck userCar = new Truck(maker, colour, capacity, height);
		garage.addVehicle(userCar);
	}

	public void delete() {
		garage.removeByID(scan.getInt());
	}

	public void createMotorbike() {
		System.out.println("Manufacturer?");
		String maker = scan.getString();

		System.out.println("Colour?");
		String colour = scan.getString();

		System.out.println("Capacity?");
		int capacity = scan.getInt();

		System.out.println("Sidecar? (true/false)");
		boolean bool = scan.getBoolean();

		Motorbike userCar = new Motorbike(maker, colour, capacity, bool);
		garage.addVehicle(userCar);
		
	}
}
