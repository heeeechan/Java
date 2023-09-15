package chap04;

// int 타입 변수 num의 각 자리의 합을 더한 결과를 출력하는 코드 작성 (문자열로 변환하지 말고 숫자로만 처리해야 함)

public class Exercise4_9 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		System.out.println("sum=" + sum);
	}
}