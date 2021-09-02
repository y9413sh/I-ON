package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 입력(2개) = ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("연산자(+,-,*,/) 입력 = ");
		String op = br.readLine();
		
		int result=0;
		switch(op) {
			case "+": result=num1+num2; break;
			case "-": result=num1-num2; break;
			case "*": result=num1*num2; break;
			case "/": result=num1/num2; break;
			default: System.out.println("다시 입력하세요.");
		}
		
		System.out.printf("%d %s %d = %d", num1, op, num2, result);
	}
}
