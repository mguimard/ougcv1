package ougcv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Compte {
}

class Banque {
	private List<Compte> comptes = new ArrayList<>();

	public void addCompte(Compte c) {
		comptes.add(c);
	}

	public List<Compte> getComptes() {
		return Collections.unmodifiableList(comptes);
	}

}

public class EncapsLists {

	public static void main(String[] args) {

		Banque b = new Banque();
		List<Compte> comptes = b.getComptes();

	}

}
