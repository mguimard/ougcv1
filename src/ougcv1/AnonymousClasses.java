package ougcv1;

abstract class Printer {
	abstract void print();

}

public class AnonymousClasses {

	public static void main(String[] args) {

		Printer p1 = new Printer() {
			@Override
			void print() {
				System.out.println("Hey !");
			}

		};

		Printer p2 = new Printer() {
			@Override
			void print() {
				System.out.println("Hoo !");
			}
		};

		p1.print();
		p2.print();

	}

}
