package chap03;

public class Exercise3_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // A�� �����ڵ�� 65

		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5 (53 - 48)
		System.out.println(c + 1); // 66 �����ȯ int��
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C
	}
}