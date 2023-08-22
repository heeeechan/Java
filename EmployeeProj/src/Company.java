public class Company {
	Employee[] employees = new Employee[100];
	int empCnt;

	void enter(Employee emp) {
		employees[empCnt] = emp;
		empCnt++;
	}

	void setBonus(int id, int bonus) {
		for (int i = 0; i < empCnt; i++) {
			if (id == employees[i].id) {
				employees[i].sal += bonus;
			}
		}
	}

	void allEmployeeInfo() {
		for (int i = 0; i < empCnt; i++) {
			System.out.printf("���:%d, �̸�:%s, �μ�:%s, �޿�:%d\n",
							  employees[i].id, employees[i].name, employees[i].dept, employees[i].sal);
		}
	}
	
	int getTotalPay() {
		int total = employees[0].sal;
		for (int i = 1; i < empCnt; i++) {
			total += employees[i].sal;
		}
		return total;
	}

	public static void main(String[] args) {
		Company com = new Company();

		Employee emp1 = new Employee(10001, "ȫ�浿", "ȫ����", 5000000);
		Employee emp2 = new Employee(10002, "��浿", "�ѹ���", 3500000);
		Employee emp3 = new Employee(10003, "�ϱ浿", "���ߺ�", 4000000);

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		com.setBonus(10001, 1000000);

		com.allEmployeeInfo();
		System.out.println("�ѱ޿���:" + com.getTotalPay());
	}
}
/*
 * ���:10001, �̸�:ȫ�浿, �μ�:ȫ����, �޿�:6000000
 * ���:10001,�̸�:��浿, �μ�:�ѹ���, �޿�:3500000
 * ���:10001, �̸�:�ϱ浿, �μ�:���ߺ�, �޿�:4000000
 * �ѱ޿���:13500000
 */