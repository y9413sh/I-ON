package ex03.IF;

import java.util.Scanner;

// if ~ else
public class MainIF {
	public static void main(String[] args) {
		int score = 88;
		String grade = null;   // String grade = "";    
		char grade2 = ' ';
		
		// 평점(학점) 구하는 프로그램 만들기 ( if )
		
		if(score>=90) 	grade = "A";
		else if(score>=80) 	grade = "B";
		else if(score>=70) 	grade = "C";
		else if(score>=60) grade = "D";
		else grade ="F";
		
		System.out.println(score + "점 ==> " + grade + "학점");
		
		if(score>=90) 	grade2 = 'A';
		else if(score>=80) 	grade2 = 'B';
		else if(score>=70) 	grade2 = 'C';
		else if(score>=60) grade2 = 'D';
		else grade2 ='F';
		
		System.out.println(score + "점 ==> " + grade2 + "학점입니다.");
		
		System.out.println("============================");
		
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}  // if end	
		
		System.out.println("============================");
		
		int n;
		System.out.println("점수 입력하세요(0~100) : ");
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		if(n >=90 && n<=100) {
			System.out.println("학점 : A");
		}
		else if(n>=80 && n<90) {
			System.out.println("학점 : B");
		}
		else if(n>=70 && n<80) {
			System.out.println("학점 : C");
		}
		else if(n>=60 && n<70) {
			System.out.println("학점 : D");
		}
		else {
			System.out.println("학점 : F");
		}

	}
}
