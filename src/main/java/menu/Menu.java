package menu;

import garage.Garage;
import utils.UserInput;

public class Menu {

	UserInput scan = UserInput.getInstance();
	CarMenu carMenu = new CarMenu();
	Garage garage = Garage.getInstance();

	public void start() {
		while (true) {
			System.out.println("What would you like to do?");
			System.out.println("1) Create");
			System.out.println("2) Read");
			System.out.println("3) Delete");
			System.out.println("4) Exit");
			System.out.println("5) Fix");
			int input = scan.getInt();
			switch (input) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				delete();
				break;
			case 4:
				break;
			case 5:
				fix();
			default:
				start();
			}
		}
	}

	private void fix() {
		System.out.println("Enter ID?");
		garage.calculateCostByID(scan.getInt());
		garage.fixVehicleByID(scan.getInt());// TODO Auto-generated method stub
		
	}

	private void create() {
		System.out.println("Create what?");
		System.out.println("1) Car");
		System.out.println("2) Motorbike");
		System.out.println("3) Truck");
		int input = scan.getInt();
		switch (input) {
		case 1:
			carMenu.createCar();
			break;
		case 2:
			carMenu.createTruck();
			break;
		case 3: 
			carMenu.createMotorbike();
			break;
		default:

		}
	}

	private void delete() {
			System.out.println("Enter ID?");
			carMenu.delete();


		}



	private void read() {
		garage.printGarage();
	}

}
