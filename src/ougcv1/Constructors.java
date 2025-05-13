package ougcv1;

/*import java.lang.*;*/

class Jouet /* extends Object */ {

	static {
		System.out.println("Jouet static bloc");
	}

	String name = null;
	int i = 0;
	boolean b = false;
	float f;

	/*
	 * public Jouet() { super(); }
	 */

	public Jouet() {
		super(); // new Object()
		System.out.println("New jouet");
	}

	public Jouet(String name) {
		super();
	}

	public void Jouet(int i) {

	}

	@Override
	public String toString() {
		return super.toString();
	}

}

class Biere {
}

public class Constructors {

	static {
		System.out.println("Constructors static bloc");
	}

	public static void main(String[] args) {
		Jouet j1 = new Jouet();
		Jouet j2 = new Jouet();
		Jouet j3;

		System.out.println(j1.f); // 0.0
		System.out.println(j2);

		if (j1 != null) {
			System.out.println(j1.f);
		}

		Object j4 = new Jouet();

		Biere b = (Biere) j4; // ClassCastException

		if (j4 instanceof Jouet) {
			System.out.println(((Jouet) j4).f);
		}

	}

}
