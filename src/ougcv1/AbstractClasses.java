package ougcv1;

abstract class Oeuvre {
	abstract void decouvrir();
}

class Livre extends Oeuvre {
	@Override
	void decouvrir() {
		System.out.println("....");
	}
}

public class AbstractClasses {

	public static void main(String[] args) {
		Oeuvre o = new Livre();
		o.decouvrir();
	}

}
