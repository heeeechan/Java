package chap03;

public class Ex3_11 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shorPi = Math.round(pi * 1000) / 1000.0; // double ���� �����ϱ� ���� 1000�� �ƴ� 1000.0 ���� ����
		System.out.println(shorPi);
	}
}

/*
Math.round(pi * 1000) / 1000.0
Math.round(3.141592 * 1000) / 1000.0
Math.round(3141.592) / 1000.0
3142 / 1000.0
3.142
*/