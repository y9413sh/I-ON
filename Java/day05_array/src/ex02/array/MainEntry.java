package ex02.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][] a = new int[2][3];  // 행크기, 열크기
		a[0][0] = 1;  //초기화
		a[0][1] = 2; 
		a[0][2] = 3; 
		a[1][0] = 4; 
		a[1][1] = 5; 
		a[1][2] = 6; 
		
		//2.
		int[][] a2 = {{1,2,3},{4,5,6}};
		int[][] a3 = new int[][]{{1,2,3},{4,5,6}};
		
		//배열 값 출력
		System.out.println("a2[0][2] = "+a2[0][2]);
		
		for (int i = 0; i < 2; i++) {  // 행의 크기
			for (int j = 0; j < 3; j++) { // 값 
				
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		} // i end
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println("배열의 행크기 : " + a2.length);
		System.out.println("배열의 열크기 : " + a2[0].length);
		System.out.println("배열의 열크기 : " + a2[1].length);
		
		for (int i = 0; i < a2.length; i++) {  // 행의 크기
			for (int j = 0; j < a2[i].length; j++) { // 값 
				
				System.out.print(a2[i][j] + " ");
			} // j end
			System.out.println();
		} // i end
		
		
		
		
	}
}









