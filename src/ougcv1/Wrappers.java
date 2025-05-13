package ougcv1;

public class Wrappers {
	private static void add(double d1, double d2) {
		System.out.println("double version: " + (d1 + d2));
	}

	private static void add(Double d1, Double d2) {
		System.out.println("Double version: " + (d1 + d2));
	}

	public static void main(String[] args) {
		Integer i = new Integer(10);
		add(10.0, i.doubleValue());

		double d = new Integer(123);

		// byte b = 128;
		byte[] bytes = new byte[2];
		bytes[0] = 127;
		bytes[0] = 128;
	}
}
