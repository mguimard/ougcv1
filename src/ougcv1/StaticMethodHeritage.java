package ougcv1;

class X {
	static void print() {
		System.out.println("X");
	}
}

class Y extends X {

	static void print() {
		System.out.println("Y");
	}
}

public class StaticMethodHeritage {

	public static void main(String[] args) {

		X x = new Y();
		x.print(); //

		Y y = new Y();
		y.print();

	}

}
