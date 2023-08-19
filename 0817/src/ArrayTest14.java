/*
입력 데이터 수 : 5
95
100
85
77
60

출력
60 77 85 95 100
 */
import java.util.Scanner;

public class ArrayTest14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();
		
		int[] arr = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}