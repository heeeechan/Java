public class ClassTest2 {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "ȫ�浿";
		per1.age = 30;
		
		System.out.println(per1.info());
		
		Person[] parr = new Person[5];
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();
	}
}