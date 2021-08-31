package ex05_whild_doWhile;

public class MultiDoWhile {
	
	public static void main(String[] args) {
		
		int a = 1, b=1;  // 변수 초기화
		
		do {
			b = 1;
			do {
				
				System.out.print(b + "\t");
				b++;  // 증감식
				
			} while(b <= 3);   // 조건
			
			System.out.println();
			a++;  // 증감
		} while(a <= 2);  // 조건
		
		
	}
	
//	while(true) {
//		if() 탈출구문
//	}
	
//	do {
//		if() 탈출구문
//	} while(true);
}













