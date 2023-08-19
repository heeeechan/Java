/*
입력 데이터 수 : 5
95
100
85
77
60

출력
최소값:60
최대값:100
 */

import java.util.Scanner;

public class ArrayTest15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();

		int[] arr = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("최소값:%d\n최대값:%d",min,max);

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				int temp;
//				// int min, max;
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		System.out.println("최소값: " + arr[0] + " ");
//		System.out.println("최대값: " + arr[arr.length -1] + " ");
	}
}
