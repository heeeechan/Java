package chap03;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;

		long c = a * b; // a * b = 2,000,000,000,000 ?
		// a * b ���� int ������ ���. �����÷ο� �߻�.

		System.out.println(c);
	}
}