package chap04;

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10;
		}
	}
}