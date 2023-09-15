package chap04;

public class Ex4_19 {
	public static void main(String[] args) {
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					break Loop1;
					// break; 이름 지정이 없어 자신이 속한 반복문만 벗어나게 함
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}