package chap02;

import java.util.Scanner;

public class Ex2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner Ŭ������ ��ü ����

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine(); // �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input); // �Է¹��� ������ intŸ���� ������ ��ȯ
		// int num = scanner.nextInt(); => ���� �Է� �޾Ƽ� ���� num�� ����

		System.out.println("�Է³��� :" + input);
		System.out.printf("num=%d%n", num);
	}
}