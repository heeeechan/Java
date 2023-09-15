package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class UnivStudent implements Comparable<UnivStudent> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // 총점
	int schoolRank; // 전교등수

	UnivStudent(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public int compareTo(UnivStudent us) {
		return us.total - this.total;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank // 새로추가
		;
	}
}

class Ex8 {
	public static void calculateSchoolRank(List<UnivStudent> list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		for (int i = 0; i < length; i++) {
			UnivStudent currUnivStudent = list.get(i);
			if (currUnivStudent.total == prevTotal) {
				currUnivStudent.schoolRank = prevRank;
			} else {
				currUnivStudent.schoolRank = i + 1;
				prevRank = i + 1;
			}
			prevTotal = currUnivStudent.total;
		}

		Collections.sort(list, (s1, s2) -> s1.schoolRank - s2.schoolRank); // 전교등수를 기준으로 오름차순 정렬
	}

	public static void main(String[] args) {
		ArrayList<UnivStudent> list = new ArrayList<>();
		list.add(new UnivStudent("이자바", 2, 1, 70, 90, 70));
		list.add(new UnivStudent("안자바", 2, 2, 60, 100, 80));
		list.add(new UnivStudent("홍길동", 1, 3, 100, 100, 100));
		list.add(new UnivStudent("남궁성", 1, 1, 90, 70, 80));
		list.add(new UnivStudent("김자바", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		Iterator<UnivStudent> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}