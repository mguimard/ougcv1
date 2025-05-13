package ougcv1;

class Saucisse {
}

public class Tabs {

	public static void main(String[] args) {
		int[] ints = new int[3]; // [0, 0, 0]
		System.out.println(ints[0]);

		String[] strings = new String[3]; // [null,null,null]
		System.out.println(strings[0]);

		Saucisse[] saucisses = new Saucisse[3]; // [null, null, null]
		System.out.println(saucisses[0]);

		Integer i = new Integer(123);

		Integer[] integers = new Integer[3]; // [null, null, null]
		System.out.println(integers[0]); //

		Boolean[] bools = new Boolean[3]; // [null,null,null]

		/*
		 * if (bools[0].booleanValue()) // NPE System.out.println("TRUE"); else
		 * System.out.println("FALSE");
		 */

		int[] tab1 = new int[2];
		int tab2[] = new int[2];

		int[] tab3 = { 123, 456 };
		int tab4[] = { 123, 456 };

		int[][] tab5 = new int[2][2];
		int[] tab6[] = new int[2][2];
		int tab7[][] = new int[2][2];

		int[][] tab8 = { { 1, 2 }, { 3, 4 } };

		int[][] tab9 = new int[2][0];
		int[][] tab10 = new int[2][];
		/*
		 * int[][] tab11 = new int[][12];
		 * 
		 * int[][] tab12 = { 1, 2 }, { 3, 4 } ;
		 */

	}

}
