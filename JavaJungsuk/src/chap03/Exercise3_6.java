package chap03;

public class Exercise3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int) ((5f / 9) * (fahrenheit - 32) * 100 + 0.5f) / 100f;

		System.out.println("Fahrenehit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);

	}
}
// 화씨(F)에서 섭씨(C)로 변환하는 코드
// 변환공식: C = 5/9 x (F - 32)
// 변환 결과는 소수 셋째자리에서 반올림
// Math.round 사용 금지
// 결과)
// Fahrenheit:100
// Celcius:37.78