package ougcv1;

abstract class Printer {
	abstract void print();

	abstract void print2();

	abstract void print3();

	abstract void print4();

	abstract void print5();

	abstract void print6();
}

public class AnonymousClasses {

	public static void main(String[] args) {

		Printer p1 = new Printer() {
			@Override
			void print() {
				System.out.println("Hey !");
			}

			@Override
			void print2() {
				// TODO Auto-generated method stub

			}

			@Override
			void print3() {
				// TODO Auto-generated method stub

			}

			@Override
			void print4() {
				// TODO Auto-generated method stub

			}

			@Override
			void print5() {
				// TODO Auto-generated method stub

			}

			@Override
			void print6() {
				// TODO Auto-generated method stub

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
