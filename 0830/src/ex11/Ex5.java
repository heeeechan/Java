package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Human implements Comparable<Human> {
	String id;
	String name;
	int age;
	String address;

	Human(String id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%d,%s", id, name, age, address);
	}

	@Override
	public int compareTo(Human h) {
		return this.id.compareTo(h.id);
	}
}

class Ex5 {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		list.add(new Human("000123", "홍길동", 24, "서울시 금천구"));
		list.add(new Human("931216", "김길동", 32, "경기도 광명시"));
		list.add(new Human("880505", "박길동", 37, "서울시 강서구"));
		list.add(new Human("991101", "차길동", 27, "경기도 과천시"));
		list.add(new Human("021213", "안자바", 22, "서울시 송파구"));
		Collections.sort(list);
		Iterator<Human> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}