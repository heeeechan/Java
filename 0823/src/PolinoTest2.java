class AA {
	int a;
	void methodA() {} //1
	void method() {} //2
	void info() {
		System.out.println(getPay());
	}
	int getPay() {
		return 0;
	}
}

class BB extends AA {
	int b;
	void methodB() {} //2
	void method() {} //4
	@Override
	int getPay() {
		return 100;
	}
}

public class PolinoTest2 {
	public static void main(String[] args) {
		AA obj = new BB();
		obj.methodA(); //1
		// obj.methodB();
		obj.method(); //4
		obj.a = 10;
		obj.info();
	}
	// �ڽ� ��ü�� �θ� ������ ���� ���, �θ𿡴� ���� �ڽ��� ������ �Լ��� ����� �� ����.
	// ��, �������̵��� �Լ��� �θ� ������ �ڽ��� �Լ��� ȣ���Ѵ�.
}