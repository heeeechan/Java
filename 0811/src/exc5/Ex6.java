package exc5;

public class Ex6 {
	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(String.format("%d��: %d", coinUnit[i], money/coinUnit[i]));
			money %= coinUnit[i];
		}
	}
}
