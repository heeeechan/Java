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
		return "�̸�:" + name + ",����:" + age;
	}
}

class Student extends Person {
	String major;
	int grade;
	
	Student() {}
	Student(String name, int age, String major, int grade) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}

	@Override // �θ��� �޼��带 ������
	String info() {
		return super.info() + ",����:" + major + ",�г�:" + grade;
	}
}

public class InheritTest1 {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.name = "������";
		stud1.age = 20;
		stud1.major = "�������";
		stud1.grade = 2;
		System.out.println(stud1.info());
		
		Student stud2 = new Student("������", 40, "����", 3);

		Person per1 = new Person();
		per1.name = "���γ���";
		per1.age = 30;
		// �θ�� �ڽ��� ����� �� ����(major, grade)
		System.out.println(per1.info());
	}
}