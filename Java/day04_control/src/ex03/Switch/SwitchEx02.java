package ex03.Switch;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도시를 선택하세요.( s, d, b, j ) = ");
		char si = sc.nextLine().charAt(0);  //문자열 중에서 첫글자 한글자만 추출함
		
		switch( si ) {
			case 's' : System.out.print("서울"); break;
			case 'd' : System.out.print("대구"); break;
			case 'b' : System.out.print("부산"); break;
			case 'j' : System.out.print("제주"); break;
			default :
				System.out.println("잘못 눌렀습니다. s, d, b, j 중에서만 선택하세요.....");
				System.exit(0);
		} // end swtich
		
		System.out.println("를(을) 선택 하셨습니다. \n");
		
	}
}
