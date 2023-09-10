package chap04;

public class Exercise4_3 {
	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("i=" + i + "sum=" + sum);
			totalSum += sum;
			System.out.println("totalSum=" + totalSum);
		}
	}
}
