public class ClassTest1 {
	public static void main(String[] args) {
		int n;
		double d;
		
		int[] arr = new int[3];

		Student stu1 = new Student();
		Student stu2;
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;
		
		System.out.println(stu1.info());
	}
}