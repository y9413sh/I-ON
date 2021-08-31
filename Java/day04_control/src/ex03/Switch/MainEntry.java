package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		String msg = null;
		
//		if( su % 2 == 0 ) {
//			msg = "even";
//		} else {
//			msg = "odd";
//		}
		
		switch(su % 2) {
			case 0: msg = "even"; break;
			case 1: msg = "odd"; break;
			default: msg = "error";
		} // end switch
		
		System.out.println(su + " ==> " + msg);
	}
}
