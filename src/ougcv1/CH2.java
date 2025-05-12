package ougcv1;

public class CH2 {

	public static int add(int i) {
		return i + 2;
	}

	public static void main(String[] args) {
		int i = 0;
		i = add(i);
		System.out.println(i); // ?
	}

	public static void main4(String[] args) {

		byte b = 112;

		switch (b) {
		case 111:
			System.out.println("123");
		case 'a':
			System.out.println("123");
			break;
		case 12:
			System.out.println("12");
			break;

		default:
			System.out.println("Non trouvé");
		}

		int a = 'A';

	}

	public static int init() {
		System.out.println("init");
		return 0;
	}

	public static boolean cond(int i) {
		System.out.println("cond");
		return i < 10;
	}

	public static void main3(String[] args) {

		for (int i = init(); cond(i); i++, System.out.println("OP")) {
			System.out.println("IN");
		}

		// init
		// cond
		// IN
		// OP
		// cond
		// IN
		// OP
		// cond
		///

	}

	public static void show(short s) {
		System.out.println("short");
	}

	public static void show(int i) {
		System.out.println("int");
	}

	public static void main2(String[] args) {

		show(123); // int

		byte b2 = 123;
		show(b2); // short

		long l = 321;
		show((int) l);

		int a = 0;

		boolean b = a == 0 || a++ > 0;

		// true || jamais exécuté
		// false || toujours exécuté
		// true && toujours exécuté
		// false && jamais exécuté

		System.out.println(b); // true
		System.out.println(a); // 0

		b = a++ > 0 && --a == 0;

		System.out.println(b); // false
		System.out.println(a); // 1

		System.out.println("hello" + (1 + 2)); //

		String s = "123";
		int i = 123;

		// System.out.println(s != i); // ko 2 types différents
		// System.out.println("hey" + 1 != 2); // ko priorité/2 types différents

		int j = 10;
		int k = -j++;

		System.out.println(k);

		if (i > 10)
			System.out.println("true");
		else {
			System.out.println("false");
		}

		boolean x = false;

		if (x == false) {
			System.out.println("x est false");
		}

		if (x = true) {
			System.out.println("x est true");
		}

	}
}

class CH2_variables {

	static boolean bool;

	public static void main(String[] args) {
		// -128 => 127

		byte b = 123;
		System.out.println(b);

		b = 124;

		// b = 128; // KO
		// 0111 1111
		b = 127;

		// 1000 0000
		b++; // safe

		System.out.println(b); // -128

		short s = 10000;
		int i = 123;
		long l = 456;
		char c = 1234;
		byte b2 = 0x7F; // 127

		short s1 = 'a';
		char s2 = 'a';

		int one_million = 1_000_000;
		int one_million_2 = 1_0____0_0_0___00;
		int abc = 123_000;

		int a_letter = 'a';
		System.out.println(a_letter);
		System.out.println(bool);
	}

}
