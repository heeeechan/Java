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
			System.out.printf("사번:%d, 이름:%s, 부서:%s, 급여:%d\n",
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

		Employee emp1 = new Employee(10001, "홍길동", "홍보부", 5000000);
		Employee emp2 = new Employee(10002, "고길동", "총무부", 3500000);
		Employee emp3 = new Employee(10003, "하길동", "개발부", 4000000);

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		com.setBonus(10001, 1000000);

		com.allEmployeeInfo();
		System.out.println("총급여액:" + com.getTotalPay());
	}
}
/*
 * 사번:10001, 이름:홍길동, 부서:홍보부, 급여:6000000
 * 사번:10001,이름:고길동, 부서:총무부, 급여:3500000
 * 사번:10001, 이름:하길동, 부서:개발부, 급여:4000000
 * 총급여액:13500000
 */