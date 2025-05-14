package ougcv1;

class Kebabier {
}

class SuperException extends Exception {
}

abstract class Writer {
	abstract void write() throws NullPointerException;

}

class MyWriter extends Writer {
	void write() throws RuntimeException {

	}
}

public class UncheckedExceptions {

	public static void main(String[] args) {
		Exception e = new Exception();
		System.out.println(e instanceof Object); //
		System.out.println(e instanceof Throwable); //
		System.out.println(e instanceof Exception); //
		System.out.println(e instanceof SuperException); //
		// System.out.println(e instanceof Error); //
		// System.out.println(e instanceof Kebabier); //

	}
}
