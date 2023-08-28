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
		
		// com.regBusinessTrip(emp1, 1); // error, Permanent ���� �Ұ���
		com.regBusinessTrip(emp2, 2); // Sales ���� ����, �Ϸ�� 300000�� incentive�� ����
		com.regBusinessTrip(emp3, 1); // PartTime ���� ����, (����ð�(1��24�ð�)*payPerTime)�� incentive�� ����

		com.allEmployeeInfo();
		System.out.println("�ѱ޿���:" + com.getTotalPay());
	}
}
/*
���:1001,�̸�:������,�޿�:5000000
���:1002,�̸�:Ȳ����,�޿�:5600000
���:1003,�̸�:������,�޿�:5520000
�ѱ޿���:16120000
*/