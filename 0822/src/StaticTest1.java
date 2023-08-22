class Number {
	int inum;
	static int snum;

	void imethod() {
		inum = 10;
		snum++; // instance 메서드에서는 static 변수 사용 가능
		imethod2();
		smethod(); // instance 메서드에서는 static 메서드 호출 가능
	}
	void imethod2() {
		
	}
	
	static void smethod() {
		snum = 100;
		// inum = 10; static method에서는 instance 변수 사용 불가
		smethod2();
		//imethod(); static 메서드에서는 instance 메서드 호출 불가
	}
	static void smethod2() {
		
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		//static(class) 변수는 객체 생성없이 사용 가능
		System.out.println(Number.snum);
		Number.smethod();
		
		//instance 변수, 메서드는는 객체 생성해야만 사용 가능
		//System.out.println(Number.inum);
		//Number.imethod();
		
		Number n = new Number();
		System.out.println(n.inum);
		System.out.println(n.snum); // static 변수는 레퍼런스를 통해서도 접근 가능
		n.imethod();
		n.smethod();
	}
}