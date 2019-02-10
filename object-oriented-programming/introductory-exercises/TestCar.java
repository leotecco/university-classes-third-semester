public class TestCar {
	public static void main(String args[]) {
		Car c = new Car();
		c.limitFuel = 100;
		c.currentFuel = 50;
		
		System.out.printf("CAR 1 - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.walk();
		
		System.out.printf("CAR 1 AFTER WALK - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.fuel();
		
		System.out.printf("CAR 1 AFTER FUEL - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.walk();
		c.walk();
		
		System.out.printf("CAR 1 AFTER WALK AGAIN - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
	}
}
