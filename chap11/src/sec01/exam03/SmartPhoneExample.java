package sec01.exam03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString(); // �����ǵ� toString() ȣ��
		System.out.println(strObj);
		
		System.out.println(myPhone); // �����ǵ� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
	}
}