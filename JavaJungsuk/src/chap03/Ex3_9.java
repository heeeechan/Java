package chap03;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;

		long c = a * b; // a * b = 2,000,000,000,000 ?
		// a * b 값은 int 범위를 벗어남. 오버플로우 발생.

		System.out.println(c);
	}
}