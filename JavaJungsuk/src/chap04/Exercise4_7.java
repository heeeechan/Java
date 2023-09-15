package chap04;

// 숫자로 이루어진 문자열 str의 각 자리의 합을 더한 결과를 출력하는 코드 작성 (String클래스의 charAt(int i)) 이용

public class Exercise4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - '0');
		}
		System.out.println("sum=" + sum);
	}
}