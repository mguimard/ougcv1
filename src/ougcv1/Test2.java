package ougcv1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Almond");

		Iterator<String> iterator = dryFruits.iterator();

		while (iterator.hasNext()) {
			System.out.println("hello");
			String dryFruit = iterator.next();
			if (dryFruit.startsWith("A")) {
				// iterator.remove();
				dryFruits.remove(dryFruit);
			}
		}

		System.out.println(dryFruits);
	}
}
