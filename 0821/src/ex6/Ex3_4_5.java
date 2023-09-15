package ex6;

public class Ex3_4_5 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "황희찬";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점수:" + s.getTotal());
		System.out.println("평균점수:" + s.getAverage());
		System.out.println(s.info());

	}
}