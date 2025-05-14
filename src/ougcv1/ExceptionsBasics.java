package ougcv1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class MyException extends Exception {

}

class MyException2 extends RuntimeException {

}

public class ExceptionsBasics {

	public static void crash() throws MyException {
	}

	public static void main(String[] args) throws MyException {
		try {
			crash();
		} finally {
			System.out.println("Fin de programme");
		}
	}

	public static void main4(String[] args) {

		try {
			// du code....
		} catch (RuntimeException e) {

		}

		try {
			// du code ....
			crash();

		} catch (MyException e) {
			// ....
		} finally {
			System.out.println("Fin de programme");
		}
	}

	public static void main3(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("/path/to/file"));
		} catch (FileNotFoundException e) {
			// gestion erreur ....
		}

	}

	public static void main2(String[] args) {

		int[] arr = new int[2];

		try {
			System.out.println(arr[2]);
		} catch (IndexOutOfBoundsException e) {
			// ...
		}

	}

	public static void main1(String[] args) {

		try {
			// du code...
		} catch (OutOfMemoryError e) {
			// ....
		}

	}

}
