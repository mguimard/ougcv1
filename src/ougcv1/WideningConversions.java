package ougcv1;

public class WideningConversions {

	public static void main1(String[] args) {
		int i = (int) (float) 1234567890;
		System.out.println(i);
	}

	public static void main(String[] args) {
		int big = 1234567890;
		float approx = big;
		System.out.println(big - (int) approx);

	}

}
