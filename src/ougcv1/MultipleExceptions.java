package ougcv1;

public class MultipleExceptions {

	public static void main(String[] args) {

		try {
			// ...
		} catch (RuntimeException e) {

		} catch (NullPointerException e) {

		}

		try {
			// ...
		} catch (NullPointerException | RuntimeException e) {

		}

	}

}
