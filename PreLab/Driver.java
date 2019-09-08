public class Driver {
	
	public static void main(String[] args) {
		// create new Audi car
		Car audi = new Car("Audi");
		// create new Nissan car
		Car nissan = new Car("Nissan");
		
		// print current speed of Audi - it is 0 
		audi.printCurrentSpeed();
		
		// call the accelerate method twice on Audi
		audi.accelerate();
		audi.accelerate();
		
		// call the accelerate method once on Nissan
		nissan.accelerate();
		
		// print current speed of Audi - it is now 20 mpH
		audi.printCurrentSpeed();
		// print current speed of Nissan - it is 10 mpH
		nissan.printCurrentSpeed();
		
		// now park the Audi car
		audi.park();
		
		// print current speed of Audi - it is now 0, because the car is parked
		audi.printCurrentSpeed();
	}
}