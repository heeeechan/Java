public class ClassTest1 {
	public static void main(String[] args) {
		int n;
		double d;
		
		int[] arr = new int[3];

		Student stu1 = new Student();
		Student stu2;
		
		stu1.name = "ȫ�浿";
		stu1.address = "����� ��õ��";
		stu1.grade = 4;
		stu1.num = 10001;
		
		System.out.println(stu1.info());
	}
}