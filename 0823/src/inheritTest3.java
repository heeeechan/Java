class Parent {
	int n;
//	Parent() {
//		System.out.println("Parent()");
//	}
	Parent(int n) {
		this.n = n;
		System.out.println("Parent(int n)");
	}
}

class Child extends Parent {
	int m;
	Child() {
		super(0);
		System.out.println("Child()");
	}
	Child(int n, int m) {
		super(n);
		this.m = m;
	}
}

public class inheritTest3 {
	public static void main(String[] args) {
		// Parent p = new Parent();
		Child c = new Child();
	}
}