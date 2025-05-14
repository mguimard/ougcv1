package ougcv1;

public class ClassesDeBase {

	static Double d; // null
	static Boolean someBoolean; // null

	static void show(Byte x) {
	}

	static void show(Short x) {
	}

	static void show(Character x) {
	}

	static void show(Integer x) {
	}

	static void show(int x) {
	}

	static void show(Object x) {
	}

	static Integer nullInteger; // null

	public static void main(String[] args) {

		show(123);
		show(123L);

		byte b = 123;
		int i = b;
		System.out.println(i);

		Byte b1 = 123;
		Integer i1 = 0;

		show(i1);

		System.out.println("123" + nullInteger); // ?

	}

	public static void main1(String[] args) {
		int i = 0;
		byte b = 0;
		boolean bool = false;
		Integer i2 = null;
		Number n;

		Boolean[] bools = new Boolean[2]; // [null, null]

		// Integer, Byte, Short, Character, Double, Long, Float, Boolean

		// System.out.println(d.toString()); // NPE

		/*
		 * if (bools[0].booleanValue()) { // NPE System.out.println("TRUE"); } else {
		 * System.out.println("FALSE"); }
		 */

		Boolean b2 = new Boolean("trUE");
		System.out.println(b2); //

		int i3 = Integer.parseInt("Hey !");
		System.out.println(i3);

	}

}
