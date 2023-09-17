package chap05;

import java.util.Scanner;

// 단어의 글자 위치를 섞어서 보여주고 원래의 단어를 맞추는 프로그램
public class Exercise5_6 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			// char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
			for (int j = 0; j < question.length; j++) {
				int k = (int) (Math.random() * words.length);

				char tmp = ' ';
				tmp = question[j];
				question[j] = question[k];
				question[k] = tmp;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));

			String answer = scanner.nextLine();

			// trim()으로 answer의 좌우 공백 제거 후, equals로 word[i]와 비교
			if (words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			} else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}
}
