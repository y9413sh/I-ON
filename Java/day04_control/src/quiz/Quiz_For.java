package quiz;

import java.util.Scanner;

public class Quiz_For {
	public static void main(String[] args) {
		//1. 원하는 단을 입력 받아서 구구단 출력
//		System.out.println("몇 단 입력 하실 래여  ? ??");
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		for(int i = 1; i <= 9 ; i++)
//		{
//			System.out.println(dan + " x " + i + " = " + dan*i);
//		}
		
		
		
		
		//2. 전체 구구단 출력
		
		int i; int j;
		for(i = 1; i <= 9 ; i++)
		{
			for(j=2  ; j <= 9; j++) {
				System.out.print(i + " x " + i + " = " + i*j + "\t");
				//System.out.printf("%d*%2d=%2d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
}









