package chap04;

// 1�� 100 ������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ������ ������ ���� ������ ����
// ��ǻ�ʹ� �ڽ��� ���� ���ؼ� ����� �˷��ְ�, ���ڸ� ������ ������ ������ �� �� ���� ���ڸ� �������� �˷��ش�.

public class Exercise4_10 {
	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� ����
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ� Ƚ���� ���� ���� ����

		// ȭ�����κ��� ����� �Է��� �ޱ� ���� scanner Ŭ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		// System.out.println(answer);
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			input = s.nextInt(); // �Է� ���� ���� ���� input�� ����
			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			} else {
				System.out.printf("�����Դϴ�. %d�� ���� ������ �����̽��ϴ�.", count);
				break;
			}
		} while (true);
	}
}