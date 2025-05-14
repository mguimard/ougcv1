package ougcv1;

public class StackDemo {

	static void recurs() {
		recurs();
	}

	public static void main(String[] args) {
		// StackOverflowError
		recurs();
	}

}
