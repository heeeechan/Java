package exc5;

public class Ex12 {
	public static void main(String[] args) {
		// 3m ¥�� �칰 �ٴڿ� �����̰� �ִ�.
		// �����̴� ������ 55cm �ö�� �� �ִ�.
		// ������ ���� ���� ���� �ھ� �Ѵ�.�ڴ� ���� 3cm�� �̲����� �����´�.
		// �����̰� �칰 ������ ������ �� ������ �ɸ���?
		// �ݺ����� ���ǹ��� �̿��Ͽ� ���α׷��� �ۼ��Ͻÿ�.
		
		int SnailMoving = 0; // �����̰� ������ ����
        int WellHeight = 300; // �칰�� ����
        int DayCount = 0; // �� ��

	    // �����̰� �칰 ������ ���� ������ �ݺ�
	    while (SnailMoving < WellHeight) {
	    	SnailMoving += 55; // ������ 55cm �ö�
	        DayCount++; // �� �� ����

	        if (SnailMoving >= WellHeight) {
	        	break; // �����̰� �칰 ������ ������ �ݺ� ����
	        }

	        SnailMoving -= 3; // �㿡 3cm �̲����� ������
	    }

	    System.out.println(DayCount + "��");
	}
}

//		int depth = 300, height = 0;
//		final int up = 55;
//		final int down = 3;
//		int days = 0;
//		
//		while (true) {
//			days++;
//			height += up;
//			if(height >= depth) break;
//			days++;
//			height -= down;
//		}
//		System.out.println(days);
