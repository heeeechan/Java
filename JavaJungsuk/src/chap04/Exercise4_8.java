package chap04;

// Math.random()�� �̿��ؼ� 1���� 6 ������ ������ ������ ���� value�� �����ϴ� �ڵ� �ۼ�

public class Exercise4_8 {
	public static void main(String[] args) {
		int value = (int) (Math.random() * 6) + 1;

		System.out.println("value=" + value);
	}
}