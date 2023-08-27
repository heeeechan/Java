package sec01.exam06;

import sec01.exam04.Audio;
import sec01.exam04.RemoteControl;
import sec01.exam04.Television;

public class MyClass {
	// 필드로 사용
	RemoteControl rc = new Television();

	// 생성자
	MyClass() {
	}
	
	MyClass(RemoteControl rc) { // 생성자의 매개 변수로 사용
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메서드
	void methodA() { // 메서드의 로컬 변수로 사용
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { // 메서드의 매개 변수로 사용
		rc.turnOn();
		rc.setVolume(5);
	}
}