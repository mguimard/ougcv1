package ougcv1;

public class LongToFloat {

	public static void main(String[] args) {
		long l = Long.MAX_VALUE;
		System.out.println(l);

		float f = Float.MAX_VALUE;
		System.out.println(f);

		System.out.println(f > l);

		long l2 = 9223372036854775807L;
		float f2 = 9223372036854775808F;

		float f3 = l;
		System.out.println(f3);
		System.out.println(f3 == l);
	}

}
