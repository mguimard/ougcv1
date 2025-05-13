package ougcv1;

class Maison {
	String addresse;

	Maison(String adresse) {
		this.addresse = adresse;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (!(other instanceof Maison))
			return false;

		return this.addresse == ((Maison) other).addresse;
	}

}

public class ComparaisonObjets {

	public static void main(String[] args) {

		Maison m1 = new Maison("rue 1");
		Maison m2 = new Maison("rue 1");

		System.out.println(m1 == m2); // false

		System.out.println(m1.equals(m2));

		m1 = m2;

		System.out.println(m1 == m2); // true

	}

}
