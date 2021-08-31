package ex02.IF;

import java.util.Scanner;

/*
  문제] 윤년/평년 판정 프로그램 작성
   if( year % 4 == 0 ) 
	  if( year % 100 != 0 ) || if( year % 400 == 0)
		"윤년" 
 */
public class MainEntry {
	public static void main(String[] args) {
		
		System.out.print("year = ");
		int year = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		String msg = null;
		
		if( year % 4 == 0 ) {
			  if(( year % 100 != 0 ) || ( year % 400 == 0)) {
				  		flag = true;
			  }		
		} // if end
		
		msg =  (flag == true) ? "윤년" : "평년";
		
		System.out.println(year + "년도 ==> " + msg);
			
	}
}
