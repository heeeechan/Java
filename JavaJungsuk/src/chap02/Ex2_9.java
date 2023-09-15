package chap02;

public class Ex2_9 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f1=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f1=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d); // %f는 기본적으로 소수점 6자리까지 출력
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("d=%014.10f%n", d);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 최소 20글자 출력공간 확보(우측정렬)
		System.out.printf("[%-20s]%n", url); // 최소 20글자 출력공간 확보(좌측정렬)
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
	}
}