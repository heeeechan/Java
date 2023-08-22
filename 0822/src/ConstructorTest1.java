class Person {
	int age;
	String name;
	
	Person() {
		this("none", 0); // �����ڿ��� �ٸ� ������ ȣ��, �ݵ�� ������ �� ó���� ȣ���ؾ� ��
	}
	Person(String n, int a) {
		age = a;
		name = n;
	}
	Person(String n) {
		this(n, 0);
	}
	Person(int a) {
		this("none", a);
	}
	Person(Person p) {
		name = p.name;
		age = p.age;
	}
	
//	String info(Person this) {
//		return "�̸�:" + this.name + ",����" + this.age;
//	}
}

public class ConstructorTest1 {
	public static void main(String[] args) {
		Person per1 = new Person("ȫ�浿", 20);
		Person per2 = new Person();
		per2.name = "��浿";
		per2.age = 30;
		Person per3 = new Person("���浿");
		Person per4 = new Person(40);
		Person per5 = new Person(per1);
	}
}