//*
package ex04.exception;

import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) throws Exception {  // 예외처리 위임

		System.out.print("x, y integer data input : ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		result = x / y;  // 예외 발생 소지가 있음

		System.out.println(x + " / " + y + " = " + result);

	}
}
//*/

