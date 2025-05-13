package ougcv1;

interface I {

	/* public static final */ String name = "Something";

	public default void f() {
		System.out.println("from interface");
	}
}

class M1 {
	void f() {
		System.out.println("from super class");
	}
}

class M2 extends M1 implements I {
	public void f() {
		super.f();
		I.super.f();
	}
}

interface I1 {
	int x();
}

interface I2 {
	void x();
}

/*
 * interface I3 implements I1{}
 * 
 * class M3 implements I1, I2 { public void x() { }
 * 
 * public int x() { } }
 */
public class InterfacesConflits {
	public static void main(String[] args) {

	}
}
