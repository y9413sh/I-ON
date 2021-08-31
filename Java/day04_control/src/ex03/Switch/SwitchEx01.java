package ex03.Switch;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {
		
		System.out.print("score = ");
		int score = new Scanner(System.in).nextInt();
		char grade = ' ';
		
		switch (score / 10) { //정수형, 문자형만 가능.  실수형 올수 없다.
			case 10:	
			case 9 : grade='A';break;		
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default: grade='F';
		} // switch end
		
		System.out.println("\n\nJusmSu = " + score + "점\t평점은 = " + grade);
	}
}
