class Number {
	int inum;
	static int snum;

	void imethod() {
		inum = 10;
		snum++; // instance �޼��忡���� static ���� ��� ����
		imethod2();
		smethod(); // instance �޼��忡���� static �޼��� ȣ�� ����
	}
	void imethod2() {
		
	}
	
	static void smethod() {
		snum = 100;
		// inum = 10; static method������ instance ���� ��� �Ұ�
		smethod2();
		//imethod(); static �޼��忡���� instance �޼��� ȣ�� �Ұ�
	}
	static void smethod2() {
		
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		//static(class) ������ ��ü �������� ��� ����
		System.out.println(Number.snum);
		Number.smethod();
		
		//instance ����, �޼���´� ��ü �����ؾ߸� ��� ����
		//System.out.println(Number.inum);
		//Number.imethod();
		
		Number n = new Number();
		System.out.println(n.inum);
		System.out.println(n.snum); // static ������ ���۷����� ���ؼ��� ���� ����
		n.imethod();
		n.smethod();
	}
}