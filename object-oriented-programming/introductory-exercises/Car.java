public class Car {
	float limitFuel;
	float currentFuel;
	
	void walk() {
		currentFuel -= 0.1;
	}
	
	void fuel() {
		currentFuel = limitFuel;
	}
}
