import pac.Number;

public class ChildNumber extends Number {
	void cmethod() {
		// 자식이어도 부모의 private 접근 불가
		// System.out.println(pnum);
		// 자식이어도 부모와 다른 패키지면 default 접근 불가
		// System.out.println(dnum);
		
		// 패키지가 다랄도 부모 protected는 접근 가능
		System.out.println(prnum);
		
		System.out.println(punum);
	}
}