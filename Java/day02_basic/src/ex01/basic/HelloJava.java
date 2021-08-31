package ex01.basic;

public class HelloJava {  

	public static void main(String[] args) {  // 시작점(진입점)
		int x = 99;
		/*
		System.out.print("he\nllo ja\t\t\tva \n");    
		System.out.println(123);
		System.out.println();
		System.out.print(555555);
		*/
		System.out.println("Hello World!"); // 문자열
		System.out.println(100);  // 정수형
		System.out.println(12.34);  // 실수형
		System.out.print("\nhappydoyeon\n\n\n");
		System.out.println('T');  // 문자
		System.out.printf("%d %c %s %s %f \n\n", 30, 'A', "A", "string", 55.789);
		System.out.println(true);  // 논리형
	} // main end

}  // class end


// package > class > method > field

// 한줄 주석  : ctrl + /
/*   여러줄 주석 */     //  ctrl + shift + /  , ctrl + shift + \

/**
 *  도큐먼트 주석
 */

// 제어문자 : \n, \t, \a, \b,....  (\문자)
// 출력서식 : %d, %f, %c, %s,..... (%문자)  <--- API 확인하기

// 모든 프로그램은 메모리상에 할당이 안되어 있으면 사용할 수 없다.







