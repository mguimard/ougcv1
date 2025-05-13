package ougcv1;

private class MyClass {
	public MyClass() {
	}
}

class AAA extends MyClass {

}

class M {
	public void main(String[] args) { // Line n1
		System.out.println("M");
	}
}

class N extends M {
	public void main(String[] args) { // Line n1
		System.out.println("M");
	}

	public static void main(String[] args) { // Line n2
		new M().main(args); // Line n3
	}
}

class PPP {
	void f() {
	};

	static void f() {
	};
}