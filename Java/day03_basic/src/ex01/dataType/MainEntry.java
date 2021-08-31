package ex01.dataType;

public class MainEntry {
	public static void main(String[] args) {
//		int x = 9;
//		long y = 8;
//		
//		System.out.println(x); // 4byte  정수데이터
//		System.out.println(100); //  int 
//		System.out.println(y);  // 8byte long 
		System.out.println(100L);  // L, l <=== long 
		
		
		short sh = 100;   // -32,768 ~ 32,767
		int iNum = -32768;   // -21억 ~ 21억 
		
		double d = 12.34;
		float f = 12.34f;  // f, F <=== float
		
		int a=9, b, c ;   // 지역변수는 반드시 초기화가 되어 있어야한다.
		
		System.out.println(a);  //
		
//		iNum = sh;   // int = short , 묵시적 형변환 : 작은데이터형이 큰데이터형으로 자동 형변환
		sh = (short)iNum;  // short = int,  명시적형변환 : 큰데이터형을 작은 데이터형으로 변환할때, 데이터 손실 발생
		
		System.out.println(sh);
		System.out.println(iNum);
		
		
		
		
	}
}
