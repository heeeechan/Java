import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {
	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(1001, "������", 5000000);
		Sales emp2 = new Sales(1002, "Ȳ����", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "������", 160, 30000);

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);

		com.allEmployeeInfo();
		System.out.println("�ѱ޿���:" + com.getTotalPay());
	}
}
/*
���:1001,�̸�:������,�޿�:5000000
���:1002,�̸�:Ȳ����,�޿�:5000000
���:1003,�̸�:������,�޿�:4800000
�ѱ޿���:14800000
*/