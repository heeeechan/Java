package emp;

public class CompnayMain {
	public static void main(String[] args) {
		Permanent emp1 = new Permanent(1001, "������", 5000000);
		Sales emp2 = new Sales(1002, "Ȳ����", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "������", 160, 30000);
		System.out.println(emp1.info());
		System.out.println(emp2.info());
		System.out.println(emp3.info());
	}
}
/*
���:1001,�̸�:������,�޿�:5000000
���:1002,�̸�:Ȳ����,�޿�:5000000
���:1003,�̸�:������,�޿�:4800000
*/