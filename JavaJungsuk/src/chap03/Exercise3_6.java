package chap03;

public class Exercise3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int) ((5f / 9) * (fahrenheit - 32) * 100 + 0.5f) / 100f;

		System.out.println("Fahrenehit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);

	}
}
// ȭ��(F)���� ����(C)�� ��ȯ�ϴ� �ڵ�
// ��ȯ����: C = 5/9 x (F - 32)
// ��ȯ ����� �Ҽ� ��°�ڸ����� �ݿø�
// Math.round ��� ����
// ���)
// Fahrenheit:100
// Celcius:37.78
