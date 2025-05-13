package ougcv1;

class Person extends Object {
	String name;

	Person(String name) {
		this.name = name;
	}
}

class Customer extends Person {
	Customer() {
		super("robert");
	}

	Customer(String name) {
		super(name);
	}

	Customer(String name, int age) {
		super(name);
	}

	Customer(String name, byte age) {
		super(name);
	}
}

public class SuperThis {
	public static void main(String[] args) {

		Customer c = new Customer();

	}
}
