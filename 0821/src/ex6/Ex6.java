package ex6;

public class Ex6 {
	// �� �� (x,y)�� (x1,y1) ���� �Ÿ��� ���Ѵ�
	static double getDistance(int x, int y, int x1, int y1) {
        double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        return distance;
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}