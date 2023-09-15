class Person {
	int age;
	String name;

	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String info() {
		return "이름:" + name + ",나이:" + age;
	}
}

class Student extends Person {
	String major;
	int grade;

	Student() {
	}

	Student(String name, int age, String major, int grade) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}

	@Override // 부모의 메서드를 재정의
	String info() {
		return super.info() + ",전공:" + major + ",학년:" + grade;
	}
}

public class InheritTest1 {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.name = "열심히";
		stud1.age = 20;
		stud1.major = "산업공학";
		stud1.grade = 2;
		System.out.println(stud1.info());

		Student stud2 = new Student("돈많은", 40, "금융", 3);

		Person per1 = new Person();
		per1.name = "내로남불";
		per1.age = 30;
		// 부모는 자식을 사용할 수 없음(major, grade)
		System.out.println(per1.info());
	}
}