package ougcv1;

class Pizza {
	int prix = 10;
}

public class methods_encaps {

	public static void increment(int i) {
		i++;
	}

	public static void increment(Pizza x) {
		x.prix++;
	}

	public static void main(String[] args) {
		int i = 0;
		increment(i);
		System.out.println(i);

		Pizza p = new Pizza();
		increment(p.prix);
		System.out.println(p.prix); // 10

		increment(p);
		System.out.println(p.prix); // 11
	}

}
