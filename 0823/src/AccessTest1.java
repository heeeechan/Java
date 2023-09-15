import pac.Number;

public class AccessTest1 {
	public static void main(String[] args) {
		Number n1 = new Number();
		// 다른 클래스의 private 멤버는 접근 불가
		// n1.pnum = 100;
		// n1.pethod();

		// n1.dnum = 100;
		n1.setDnum(100);
		n1.dmethod();

		n1.punum = 100;
		n1.pumethod();

		// 자식도 아니고 같은 패키지도 아님. protected 접근 불가
		// n1.prnum = 100;
	}
}