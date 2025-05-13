package ougcv1;

class Camion {

	public static Camion Create() {
		return new Camion();
	}

	static int count = 0;

	Camion() {
		count++;
	}

	private boolean started = false;

	public void start() {
		started = true;
	}

	public boolean isStarted() {
		return started;
	}

}

public class Encap {

	public static void main(String[] args) {

		Camion c = new Camion();
		Camion c2 = new Camion();
		Camion c3 = null;
		Camion c4 = Camion.Create();

		if (!c.isStarted())
			c.start();

		System.out.println(c.count); // ?
		System.out.println(c2.count); // ?
		System.out.println(c3.count); // ?
		System.out.println(Camion.count); // ?

	}

}
