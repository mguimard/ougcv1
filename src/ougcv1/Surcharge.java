package ougcv1;

public class Surcharge {

	static void show(char i) {
	}

	static void show(short i) {
	}

	static void show(int i) {
	}

	static String show(float i) {
		return "test";
	}

	public static void main(String[] args) {

		show(123);
		show('A');
		show(new Integer(123));
		show(123.0f);

		byte b = 123;

		show(b);

		// 0000 0001
		// 0000 0001 0000 0001
		// 0000 0001 0000 0001 0000 0001 0000 0001

		double d = 1223.0;
		show((float) d);
	}

}
