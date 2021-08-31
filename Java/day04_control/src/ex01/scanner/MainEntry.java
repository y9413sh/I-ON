package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// next() vs nextLine() 
		Scanner sc = new Scanner(System.in);  //객체생성, 메모리에할당, 생성자함수 자동호출됨
		
		System.out.println("string input : ");
		String str = sc.next();
		String msg = sc.nextLine();
		
		System.out.println("stirng next() is : " + str);
		System.out.println("string nextLine() is : " + msg);
	}
}
