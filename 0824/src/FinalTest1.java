class TempClass {
	final int x;
	TempClass() {
		x = 30;
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		final int n;
		n = 10;
		// n = 20;
		System.out.println(n);
	}
}