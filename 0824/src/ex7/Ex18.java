package ex7;

class Ex18 {
	static void action(Robot robot) {
		if (robot instanceof DanceRobot) {
			DanceRobot danceRobot = (DanceRobot) robot;
			danceRobot.dance();
		} else if (robot instanceof SingRobot) {
			SingRobot singRobot = (SingRobot) robot;
			singRobot.sing();
		} else {
			DrawRobot drawRobot = (DrawRobot) robot;
			drawRobot.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}