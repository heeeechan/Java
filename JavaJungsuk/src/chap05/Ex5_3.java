package chap05;

public class Ex5_3 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // �迭�� ù ��° ������ �ִ��� �ʱ�ȭ
		int min = score[0]; // �迭�� ù ��° ������ �ּڰ��� �ʱ�ȭ

		for (int i = 1; i < score.length; i++) { // �迭�� �� ��° ��Һ��� �б� ���� i ���� 1�� �ʱ�ȭ
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ� :" + max);
		System.out.println("�ּڰ� :" + min);
	}
}