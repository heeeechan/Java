package chap03;

public class Exercise3_5 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));
	}
}
// num의 값에 따라 '양수', '음수', '0'을 출력하는 코드 작성. 삼항연산자 이용
// 결과) 양수