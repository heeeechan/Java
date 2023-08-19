package exc5;

import java.util.Scanner;

public class Ex7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("거스름돈:");
		int money = sc.nextInt();
			
		System.out.println("money=" + money);
		
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; //3170 : 500-5, 100-5, 50-3, 10-2 // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			coinNum = money / coinUnit[i] < coin[i] ? money / coinUnit[i] : coin[i];
			
			System.out.println(coinUnit[i] + "원: " + coinNum);
			coin[i] -= coinNum;
			money -= coinUnit[i] * coinNum;
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	}
}