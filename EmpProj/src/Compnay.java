import emp.Employee;

public class Compnay {
	static Employee[] emps = new Employee[100];
	static int empCnt = 0;

	public static void enter(Employee emp) {
		emps[empCnt++] = emp;
	}

	public static void allEmployeeInfo() {
		for (int i = 0; i < empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	public static int getTotalPay() {
		int tot = 0;
		for (int i = 0; i < empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}
}