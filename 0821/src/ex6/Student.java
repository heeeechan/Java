package ex6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round(((kor + eng + math) / 3.0f) * 10.0f) / 10.0f;
	}
	
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}