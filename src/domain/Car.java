package domain;

public class Car implements IVehicle {

	@Override
	public void startEngine() {
		System.out.println("Started the engine of the car...");
	}

}
