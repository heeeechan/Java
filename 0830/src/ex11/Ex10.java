package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Ex10 {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		for (int i = 1; i <= 30; i++) {
			numberList.add(i);
		}

		Collections.shuffle(numberList); // 숫자 리스트를 랜덤하게 섞음

		int[][] board = new int[5][5];
		Iterator<Integer> it = numberList.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	} // main
}