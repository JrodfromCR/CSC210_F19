public class Driver {

	public static void main(String[] args) {

    /* UNCOMMENT as you build up your classes and interfaces */

    // create fleet of new cars of different types
		Car audi = new Car("Audi");
		Car nissan = new Car("Nissan");
    //EcoCar leaf = new EcoCar("Leaf");
    //SportsCar porsche = new SportsCar("Porsche");

    // put all the cars in an array
    Car cars[] = {audi,nissan}; //,leaf,porsche};

    for (Car car: cars) {
      System.out.println("\n*** "+car.getName()+" ***");
      car.printCurrentSpeed();
      car.accelerate(2);
      System.out.print("Accelerated: ");
      car.printCurrentSpeed();
      System.out.println("Emissions: " + car.CO2());
      car.park();
      System.out.print("Parked: ");
      car.printCurrentSpeed();
    }
	}
	}
}
