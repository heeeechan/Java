package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); // �߻�Ŭ������ ���� ������ ȣ���Ͽ� ��ü ������ �� ����
		
		SmartPhone smartPhone = new SmartPhone("������");
		
		smartPhone.turnOn(); // Phone�� �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone�� �޼ҵ�
	}
}