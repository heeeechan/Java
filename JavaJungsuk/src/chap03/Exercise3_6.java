package chap03;

public class Exercise3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float calCelcius = ((float) 5 / 9) * (fahrenheit - 32);
//		float calCelcius = ((float) 5 / 9) * (fahrenheit - 32) * 1000;

		float celcius = calCelcius;

		System.out.println(calCelcius);
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
