package ougcv1;

class Lezard {

}

public class NewAndRefs {

	public static void main(String[] args) {
		Lezard l1 = new Lezard(); // A
		Lezard l2 = new Lezard(); // B

		Lezard l3;
		l3 = l2;

		l2 = l1;
		l1 = null;
		// A = 1
		// B = 1

		l2 = null;
		// A = 0
		// B = 1

		l3 = null;
		// A = 0
		// B = 0

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		// code .... ..
	}

}
