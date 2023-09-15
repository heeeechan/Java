public class Person {
	String name;
	int age;

	String info() {
		// return String.format("이름:%s, 나이:%d", name, age);
		return "이름:" + name + " 나이:" + age;
	}
}