public class RandomTest {

	public static void main(String[] args) {
		// 2~8 ������ ���ϱ�
		int r = (int) (Math.random() * (8 - 2 + 1)) + 2;
		// (int) (Math.random() * (�ִ� - �ּڰ� + 1)) + �ּڰ�
		System.out.println(r);
	}
}