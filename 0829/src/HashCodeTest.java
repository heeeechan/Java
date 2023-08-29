import java.util.HashSet;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false) {
			return false;
		}
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
}

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = "kim";
		String str2 = "kim";
		// System.out.println(str1.hashCode());
		// System.out.println(str2.hashCode());

		Person p1 = new Person("kim", 30);
		Person p2 = new Person("kim", 30);
		// System.out.println(p1.hashCode());
		// System.out.println(p2.hashCode());

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10);
		for (Object o : hs) {
			System.out.println(o);
		}
	}
}