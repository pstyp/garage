package automotives;

public class Car extends Vehicle {

	private int wheels;
	private int doors;

	public Car(String maker, String colour, int wheels, int doors) {
		super("Car", maker, colour);
		this.wheels = wheels;
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public double calculateCost() {
		return 150;
	}

}
