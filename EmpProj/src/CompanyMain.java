import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {
	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(1001, "김희찬", 5000000);
		Sales emp2 = new Sales(1002, "황희찬", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "서희찬", 160, 30000);

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		
		// com.regBusinessTrip(emp1, 1); // error, Permanent 출장 불가능
		com.regBusinessTrip(emp2, 2); // Sales 출장 가능, 하루당 300000원 incentive로 지급
		com.regBusinessTrip(emp3, 1); // PartTime 출장 가능, (출장시간(1일24시간)*payPerTime)원 incentive로 지급

		com.allEmployeeInfo();
		System.out.println("총급여액:" + com.getTotalPay());
	}
}
/*
사번:1001,이름:김희찬,급여:5000000
사번:1002,이름:황희찬,급여:5600000
사번:1003,이름:서희찬,급여:5520000
총급여액:16120000
*/