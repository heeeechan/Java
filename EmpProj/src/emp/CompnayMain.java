package emp;

public class CompnayMain {
	public static void main(String[] args) {
		Permanent emp1 = new Permanent(1001, "김희찬", 5000000);
		Sales emp2 = new Sales(1002, "황희찬", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "양희찬", 160, 30000);
		System.out.println(emp1.info());
		System.out.println(emp2.info());
		System.out.println(emp3.info());
	}
}
/*
사번:1001,이름:김희찬,급여:5000000
사번:1002,이름:황희찬,급여:5000000
사번:1003,이름:양희찬,급여:4800000
*/