package garage;

import java.util.ArrayList;

import automotives.Vehicle;

public class Garage {
	
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public void removeByID(int id) {
		Vehicle found = null;
		for(Vehicle vehicle: garage) {
			if(vehicle.getID() == id) {
				found = vehicle;
			}
		}
		garage.remove(found);
	}
	
	public void removeByType(String type) {
		Vehicle found = null;
		for(Vehicle vehicle: garage) {
			if(vehicle.getType() == type) {
				found = vehicle;
			}
		}
		garage.remove(found);
	}
	
	public double calculateCostByID(int id) {
		for(Vehicle vehicle: garage) {
			if(vehicle.getID() == id) {
				return vehicle.calculateCost();
			}
		}
		return 0;
	}
	
	public void fixVehicleByID(int id) {
		for(Vehicle vehicle: garage) {
			if(vehicle.getID() == id) {
				System.out.println("This " + vehicle.getType() + " was repaired for £" + vehicle.calculateCost());
			}
		}
		removeByID(id);
	}
	
	public void empty() {
		garage.clear();
	}
}
