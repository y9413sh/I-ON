
//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1, 2, 3 중에서 숫자 입력 요망 :  ");
		int point = sc.nextInt();
		
		switch( point ) {
			case 1: System.out.print(" 집 "); //break;
			case 2: System.out.print(" 피아노 "); //break;
			case 3: System.out.print(" 우산 "); //break;
		} // end swtich
		
		System.out.println("상품에 당첨 되셨습니다.!!! \n");
		
	}
}
//*/


/*
package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1, 2, 3 중에서 숫자 입력 요망 :  ");
		int point = sc.nextInt();
		
		switch( point ) {
			case 1: System.out.print(" 집 "); break;
			case 2: System.out.print(" 피아노 "); break;
			case 3: System.out.print(" 우산 "); break;
			default :
				System.out.println("범위에 없는 숫자 입니다. 다시 선택하세요.");
				System.exit(0);
		} // end swtich
		
		System.out.println("상품에 당첨 되셨습니다.!!! \n");
		
	}
}
//*/