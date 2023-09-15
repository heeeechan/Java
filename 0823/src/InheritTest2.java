class Base {
	int bnum;

	void method1() {
	} // 1

	void method2() {
	} // 2

}

class Derived extends Base {
	int dnum;

	void method1(int n) {
	}

	void method2() {
		method1();
		super.method2();
		method2();
	}
}

public class InheritTest2 {
	public static void main(String[] args) {
		Base b = new Base();
		b.bnum = 10;
		b.method1(); // 1
		b.method2(); // 2

		Derived d = new Derived();
		d.bnum = 20;
		d.dnum = 30;
		d.method1(); // 1
		d.method2(); // 3
	}
}