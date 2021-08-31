package quiz;

import java.util.Scanner;

public class Quiz_switch {
	public static void main(String[] args) {
		//사칙연산 프로그램 작성 - 연산자 1개,  정수숫자 2개
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("integer data 2개 입력하세요 : ");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			System.out.println("operator(+, -, *, / ) =  ");
			String op = sc.next();
//			char op = sc.next().charAt(0);
			
			int result = 0;

//			if(op == '+') result = su1 + su2;
			
			switch(op) {
				case "+" : result = su1 + su2; break;
				case "-" : result = su1 - su2; break;
				case "*" : result = su1 * su2; break;
				case "/" : result = su1 / su2; break;
				default: {
					System.out.println("+, -, *, / 중에서만 입력 요망.");
					System.exit(0);
				}
			}
			
			System.out.println("\n\n");
			System.out.println(su1 +" "+ op+" " + su2  + " = " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}






