class MyClass {
	int num;
	static int snum;

	void setNum(int n) {

	}
}

public class VariableTest1 {
	public static void main(String[] args) {
		int n;
		MyClass mc = new MyClass(); // num 변수 생성

		// System.out.println(n); //초기화하지 않고 사용시 에러
		System.out.println(mc.num); // 초기화하지 않고 사용 가능
	}
}