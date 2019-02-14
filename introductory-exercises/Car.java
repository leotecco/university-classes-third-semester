public class Car {
	float limitFuel;
	float currentFuel;
	
	void walk() {
		if (currentFuel >= 1) {
			currentFuel -= 1;
			return;
		}
		
		System.out.printf("EMPTY FUEL!\n");
	}
	
	void fuel() {
		currentFuel = limitFuel;
	}
}
