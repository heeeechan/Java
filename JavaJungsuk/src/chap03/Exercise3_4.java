package chap03;

public class Exercise3_4 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = (numOfApples / sizeOfBucket) + ((numOfApples % sizeOfBucket) > 0 ? 1 : 0);
		// ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
	}
}
// ���) �ʿ��� �ٱ����� �� :13