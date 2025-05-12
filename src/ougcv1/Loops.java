package ougcv1;

public class Loops {

	public static void main(String[] args) {
		do {
			// ...

		} while (true);

		System.out.println("test");
	}

	public static void deadcode(String[] args) {

		if (true) {
			System.out.println("True");
		} else {
			System.out.println("test");
		}

	}

	public static void unreachablev3(String[] args) {
		final boolean b = true;

		while (b) {
			System.out.println("Hello");
		}

		// unreachable code
		System.out.println("Hello");
	}

	public static void unreachablev2(String[] args) {
		boolean b = true;

		while (b) {
			System.out.println("Hello");
		}

		// unreachable code
		System.out.println("Hello");
	}

	public static void unreachable(String[] args) {

		while (true) {
			System.out.println("Hello");
		}

		// unreachable code
		System.out.println("Hello");
	}

	public static void loops(String[] args) {

		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
		}

		int[] arr = { 4, 2, 1, 0 };

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
		}

		for (int i : arr) {
			System.out.println(arr[i]);
		}
	}

}
