package ex04.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.print("x, y integer data input : ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		if( y != 0 )		result = x / y;
		else {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);  //
		}
		
		System.out.println(x + " / " + y + " = " + result);
		
		
	}
}
