class MyClass {
	int num;
	static int snum;
	
	void setNum(int n) {
		
	}
}

public class VariableTest1 {
	public static void main(String[] args) {
		int n;
		MyClass mc = new MyClass(); //num ���� ����
		
		//System.out.println(n); //�ʱ�ȭ���� �ʰ� ���� ����
		System.out.println(mc.num); //�ʱ�ȭ���� �ʰ� ��� ����
	}
}