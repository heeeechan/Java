package chap05;

import java.util.Arrays;

public class Ex5_4 {
	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9 중의 한 값을 임의로 얻음
			// numArr[0]과 numArr[n]의 값을 서로 바꿈
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}