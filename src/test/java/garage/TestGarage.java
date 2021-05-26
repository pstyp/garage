package garage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import automotives.Vehicle;
import automotives.Car;

public class TestGarage {
	
	Garage testGarage = Garage.getInstance();
	
	@Test
	public void testGetGarage() {
		assertEquals(testGarage.getGarage(), new ArrayList<Vehicle>());
	}
	
	@Test
	public void testAddVehicle() {
		Car testCar = new Car("Test", "Testy", 1, 1);
		
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(testCar);
		
		testGarage.addVehicle(testCar);
		assertEquals(testGarage.getGarage(), testArray);
	}
	
	
	
	
	
	
	
	
	
	
	@BeforeClass
	public static void init() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}
}
