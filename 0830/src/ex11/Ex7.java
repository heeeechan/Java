package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Person {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Person(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
} // class Person

class BanNoAscending implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		if (p1.ban == p2.ban) {
			return p1.no - p2.no;
		} else {
			return p1.ban - p2.ban;
		}
	}
}

class Ex7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("이자바", 2, 1, 70, 90, 70));
		list.add(new Person("안자바", 2, 2, 60, 100, 80));
		list.add(new Person("홍길동", 1, 3, 100, 100, 100));
		list.add(new Person("남궁성", 1, 1, 90, 70, 80));
		list.add(new Person("김자바", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}