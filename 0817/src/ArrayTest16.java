/*
행렬 크기 : 7
1
11
101
1001
10001
100001
1000001
 */

import java.util.Scanner;

public class ArrayTest16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("행렬 크기 : ");
		int size = sc.nextInt();
		int[][] matrix = new int [size][size];
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][0] = 1;
				if (i == j) {
					matrix[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}	
}