class TClass1 {
	void method1() {
		int num1;
		method2(); //���� Ŭ���� ���� �޼ҵ�� ������ ���� ȣ���� ������(���۷��� ���� ����)
	}
	void method2() {
		int num2;
		method3();
	}
	void method3() {
		int num3;
	}
}

class TClass2 {
	void title() {
		System.out.println("-----");
		System.out.println("����");
		boolean flag = false;
		if(flag == true)
			return;
		System.out.println("-----");
	}
	int retFunc() {
		return 10;
	}
}

public class ClassTest4 {
	public static void main(String[] args) {
		TClass1 tc = new TClass1();
		tc.method1();
		
		
	}
}