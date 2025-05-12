package ougcv1;

class Chien {
	static String cri = "Aboie";
	String name;

	Chien(String name) {
		this.name = name;
	}
}

public class methodsv2 {

	public static void swap(Chien x) {
		x = new Chien("Maxou");
	}

	public static void main(String[] args) {
		Chien c = new Chien("medor");

		Chien e = c;
		e = null;

		System.out.println(c.name);

		swap(c);
		// 1 instance de chien éligible au GC

		System.out.println(c.name); // medor

		// System.out.println(e.name); // NullPointerException

		System.out.println(Chien.cri); // ?
		System.out.println(c.cri); // ?
		System.out.println(e.cri); // ?

	}

}
