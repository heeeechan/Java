public class Company {
	Employee[] emps = new Employee[100];
	int empCnt;

	void enter(Employee emp) {
		emps[empCnt++] = emp;
	}

	void setBonus(int id, int money) {
		Employee emp = null;
		for (int i = 0; i < empCnt; i++) {
			if (emps[i].id == id) {
				emp = emps[i];
				break;
			}
		}
		if (emp == null) {
			System.out.println("����� Ʋ���ϴ�.");
			return;
		}
		emp.payBonus(money);
	}

	void allEmployeeInfo() {
		for (int i = 0; i < empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	int getTotalPay() {
		int tot = 0;
		for (int i = 0; i < empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
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
���:10001, �̸�:ȫ�浿, �μ�:ȫ����, �޿�:6000000
���:10002, �̸�:��浿, �μ�:�ѹ���, �޿�:3500000
���:10003, �̸�:�ϱ浿, �μ�:���ߺ�, �޿�:4000000
�ѱ޿���:13500000
*/