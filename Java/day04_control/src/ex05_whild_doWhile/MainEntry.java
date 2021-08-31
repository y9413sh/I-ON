package ex05_whild_doWhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1; // 변수의 초기화
		
		while(a < 11) {  //조건식
			System.out.println("Hello~" + a);
			a++; // 증감식
		}
		
		System.out.println("--------------------------");
		int b = 10;  // 변수 초기화
		do {
			System.out.println("Hello~" + b);
			b--;  // 증감식
		} while(b >= 1);
		
	}
}
