package ougcv1;

class Animal {

	void cri() {
		System.out.println("Cri par défaut");
	}

	final void marche() {
	}
}

final class Chat extends Animal {
	@Override
	final void cri() {
		super.cri();
		super.marche();
		System.out.println("Miaou");
	}

	void ronronne() {
		System.out.println("rrrrr");
	}
}

class Serpent extends Animal {
	@Override
	void cri() {
		System.out.println("Tssss");
	}
}

public class Heritage {

	public static void main(String[] args) {
		Chat c1 = new Chat();
		c1.cri(); // Miaou

		Animal c2 = new Chat();
		c2.cri(); // Miaou

		Animal s1 = new Serpent();

		Animal a = new Animal();
		a.cri();

		// Chat c3 = new Animal();

		Animal[] animals = { c2, s1 };

		for (Animal animal : animals) {
			animal.cri();
			if (animal instanceof Chat) {
				((Chat) animal).ronronne();
			}

		}

	}

}
