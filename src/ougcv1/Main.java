package ougcv1;
//package ougcv2; // KO (1 seul package)

import pkg2.Animal;
import pkg2.Voiture;
import pkg2.test.Robot;

// 1 seule class public (top level classes)

// private: privé
// protected: accès au travers du package ou instance classe mère
// public: open bar
// rien : "package protected"  accès au travers du package

class Class1 {
	static public int a = 0;
	static private int b = 0;
	static protected int c = 0;
	static int d = 0;
}

class main {
}

class Whatever {
	public Whatever() {

	}
}

public class Main {

	static int a;
	static float b;
	static String c;

	public static void main(int[] args) {
		System.out.println("int version");
	}

	public static void main(char[] args) {
		System.out.println("char version");
	}

	public static void main(Object[] args) {
	}

	public static void test(int i) {

	}

	public static void test(float i) {

	}

	public static void main(String[] args) {
		System.out.println("String version");

		test(123);
		test(123.0f);

		System.out.println(a); // ? 0
		System.out.println(b); // ? 0.0
		System.out.println(c); // ? null

		System.out.println("Chaine c : " + c);

		System.out.println(c.length()); // NullPointerException
		// A : 0
		// B : compilation error
		// C : Exception
		// D : la réponse D

		Main m = new Main();

		System.out.println("Hello world");
		Animal a = new Animal();
		Voiture v = new Voiture();
		Robot r = new Robot();

		System.out.println(Class1.a);
		System.out.println(Class1.c);
		System.out.println(Class1.d);

	}
};