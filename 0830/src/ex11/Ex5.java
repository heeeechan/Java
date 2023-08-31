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
		list.add(new Human("000123", "ȫ�浿", 24, "����� ��õ��"));
		list.add(new Human("931216", "��浿", 32, "��⵵ �����"));
		list.add(new Human("880505", "�ڱ浿", 37, "����� ������"));
		list.add(new Human("991101", "���浿", 27, "��⵵ ��õ��"));
		list.add(new Human("021213", "���ڹ�", 22, "����� ���ı�"));
		Collections.sort(list);
		Iterator<Human> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}