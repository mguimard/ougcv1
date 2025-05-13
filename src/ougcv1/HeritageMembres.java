package ougcv1;

class C1 {
	public int i = 0;
}

class C2 extends C1 {
	protected int i = 1;

	void show() {
		System.out.println(super.i);
	}
}

public class HeritageMembres {

	public static void main(String[] args) {

		C1 c = new C2();
		System.out.println(c.i);

		C2 d = new C2();
		System.out.println(d.i);
	}

}
