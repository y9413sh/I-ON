//*
package ex04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {

		try {
			System.out.print("x, y integer data input : ");
			int x, y, result = 0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y;

			System.out.println(x + " / " + y + " = " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");	
		} catch ( InputMismatchException e) {
			System.out.println("InputMismatchException");		
		} catch (Exception e) {
			System.out.println("Exception");		
		} finally {
			System.out.println("finally 무조건 실행됩니다.");
		}

	}
}
//*/

/*
package ex04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {

		try {
			System.out.print("x, y integer data input : ");
			int x, y, result = 0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y;

			System.out.println(x + " / " + y + " = " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");	
		} catch ( InputMismatchException e) {
			System.out.println("InputMismatchException");		
		} catch (Exception e) {
			System.out.println("Exception");		
		}

	}
}
//*/



/*
package ex04.exception;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {

		try {
			System.out.print("x, y integer data input : ");
			int x, y, result = 0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y;

			System.out.println(x + " / " + y + " = " + result);
			
		} catch (Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			//System.out.println(e.getMessage());
			e.printStackTrace();			
		}

	}
}
//*/