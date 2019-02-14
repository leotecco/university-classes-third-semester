import java.util.Scanner;

public class TestCar {
	public static void main(String args[]) {
		Car c = new Car();

		System.out.printf("CAR \n");
		Scanner s = new Scanner(System.in);
		
		System.out.printf("LIMIT FUEL: ");
		c.limitFuel = s.nextInt();
		s.nextLine();

		System.out.printf("CURRENT FUEL: ");
		c.currentFuel = s.nextInt();
		s.nextLine();

		System.out.printf("CAR 1 - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.walk();
		
		System.out.printf("CAR 1 AFTER WALK - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.fuel();
		
		System.out.printf("CAR 1 AFTER FUEL - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
		
		c.walk();
		c.walk();
		c.walk();
		
		System.out.printf("CAR 1 AFTER WALK AGAIN - LIMIT FUEL: %f, CURRENT FUEL: %f\n", c.limitFuel, c.currentFuel);
	}
}
