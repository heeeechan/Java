package sec01.exam05;

import sec01.exam04.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		// �������̽� ������ ���� ��ü ����
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}