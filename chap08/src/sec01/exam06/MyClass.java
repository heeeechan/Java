package sec01.exam06;

import sec01.exam04.Audio;
import sec01.exam04.RemoteControl;
import sec01.exam04.Television;

public class MyClass {
	// �ʵ�� ���
	RemoteControl rc = new Television();

	// ������
	MyClass() {
	}
	
	MyClass(RemoteControl rc) { // �������� �Ű� ������ ���
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// �޼���
	void methodA() { // �޼����� ���� ������ ���
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { // �޼����� �Ű� ������ ���
		rc.turnOn();
		rc.setVolume(5);
	}
}