package ougcv1;

class Kebab {
}

class MySuperException extends Exception {
	MySuperException(String msg, int errorCode, Kebab k) {
		super(msg);
	}
}

public class Exceptions3 {

	static void f() throws MySuperException {
		throw new MySuperException("Mon message d'erreur...", 123, new Kebab());
	}

	public static void main(String[] args) {

		try {
			f();
		} catch (MySuperException e) {
			System.out.println("Oooops: " + e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}

	}

}
