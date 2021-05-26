package menu;

import automotives.Car;
import garage.Garage;
import utils.UserInput;

public class CarMenu {

	UserInput scan = UserInput.getInstance();
	Garage garage = Garage.getInstance();

	public void create() {
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

	public void delete() {
		garage.removeByType("Car");
	}
}
