package sec01.exam12;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = new String("������");
		String strVal2 = "������";

		if (strVal1 == strVal2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}
}