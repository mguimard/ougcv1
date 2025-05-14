package ougcv1;

public class Strings {

	public static void main(String[] args) {
		String s = "Hello ";
		s.concat("world");
		System.out.println(s); // ?
	}

	public static void main4(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append(123);
		System.out.println(buf.toString());
	}

	public static void main3(String[] args) {

		StringBuilder sb = new StringBuilder(50);

		sb.append("hello world");

		System.out.println(sb.toString());
		System.out.println(sb.capacity());

		sb.append("hello world");
		sb.append("hello world");
		sb.append(123);

		System.out.println(sb.capacity());
		System.out.println(sb.toString());

		System.out.println(sb.toString().equals(sb.toString()));

		StringBuilder sb2 = new StringBuilder(10);
		System.out.println(sb2.length()); // 0
		System.out.println(sb2.capacity()); //
	}

	public static void main2(String[] args) {
		String s = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2); //
		System.out.println(s1.equals(s2)); //

		String s3 = "Hel";
		s3 = s3 + "lo";

		System.out.println(s3);
		System.out.println(s3 == "Hello");

		// System.out.println(s.charAt(50));

		String csv = "renault,twingo,60";
		String[] datas = csv.split(",");
		System.out.println(datas[0]);

		String[] datas2 = csv.split(";");
		System.out.println(datas2[0]);

	}

	public static void main1(String[] args) {
		String s = "hello    ";
		String s2 = s.trim();
		System.out.println(s.length());
		System.out.println(s2.length());
	}
}
