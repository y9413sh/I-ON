package ex06.method;

import java.util.Scanner;

public class MainEntry {
	
	//2) 매개변수있고, 리턴타입 없는 경우
	public static  void name(String irum) {
		System.out.println("당신은 " + irum + "님 이시군요");
	}

	public static void plus(int x, int y, String msg) {
		int hap = x + y;
		System.out.println(x + "+" + y +"=" + hap);
		System.out.println(msg);
	}
	
	// 3) 매개변수 없고, 리턴타입 있는 경우
	public static int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		if( x > y ) return x;
		else return y;
		//return ;  // return 오직1개;
	}
	
	//4) 매개변수 있고, 리턴타입 있는 경우
	public static String name(int x, String n) {
//		System.out.println("x = " + x);
//		return n;
//		String str = x + " " + n;
		return x + " " + n;
	}
	
	public static void main(String[] args) {  //시작점(진입점)
		System.out.println(name(3, "start"));
		
//		int su = max();
//		System.out.println("max = " + su); 
//		System.out.println(max());
		
		name("doyeon");
		System.out.println("main start!!!");
		line(); // 호출
		name("park");
		System.out.println("main end~~~");
		name("aa");
		name("bb");
	}

	//1) 매개변수 없고, 리턴타입 없는 경우
	public static void line() {  // 정의부
		System.out.println("--------------------");
	}
	
	
}
