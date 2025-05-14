package ougcv1;

interface CanStop {
	void stop() throws VehicleException;
}

class VehicleException extends Exception {
}

class NoMoreGasException extends VehicleException {
}

abstract class Vehicle {
	public abstract void start() throws VehicleException;
}

class Car extends Vehicle implements CanStop {

	public void start() throws NoMoreGasException {

	}

	public void stop() {

	}

}

class Bike extends Vehicle {

	public void start() {

	}

}

public class ExceptionsLevel {

	public static void main(String[] args) {
		Vehicle car = new Car();

		try {
			car.start();
		} catch (VehicleException e) {

		}

		Car c = (Car) car;

		try {
			c.start();
		} catch (NoMoreGasException e) {

		}

		Vehicle[] vehicles = { new Car(), new Bike() };

		for (Vehicle v : vehicles) {
			try {
				v.start();
			} catch (VehicleException e) {

			}
		}
	}

}
