package ougcv1;

public class StaticExample {

	static {
		System.out.println("Static bloc 1");
	}

	final static int i = 10;

	static {
		System.out.println("Static bloc 2");

		System.out.println(i);

		// i /= 0;

		// i++;
	}

	public static void main(String[] args) {

		System.out.println(i);
		System.out.println("test");
	}

}
