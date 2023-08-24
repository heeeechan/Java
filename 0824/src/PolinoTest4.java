class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~");
	}
}

public class PolinoTest4 {
	public static void main(String[] args) {
		FireEngine fireEngine = new FireEngine();
		fireEngine.water();

		Car car = fireEngine; // upcasting
		// car.water();
		if (car instanceof FireEngine) {
			FireEngine fireEngine2 = (FireEngine) car; // downcasting
			fireEngine2.water();
		}
	}
}