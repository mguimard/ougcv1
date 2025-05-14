package ougcv1;

public class Exceptions2 {

	/**
	 * This method blababla...
	 * 
	 * @throws NullPointerException
	 */
	public static void f() {
		String s = null;

		s.trim();
	}

	public static void main(String[] args) {
		f();
	}

	public static void main1(String[] args) {
		try {
			int i = 10 / 0;
			// ... fin de bloc
			System.out.println(i);
		} finally {
			System.out.println("Fin de programme");
		}
	}

}
