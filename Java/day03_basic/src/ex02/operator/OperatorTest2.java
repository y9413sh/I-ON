//*
package ex02.operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// shift 연산자 :  << , >> , <<< 
		int x = 8,  y ;
		
//		y = x >> 3;  // right shift  :   원래값 / 2 ^ bit수
		y = x << 2;  // left shift  :  원래값 * 2 ^ bit수 
		
		System.out.println(x + " ==> " + y );
	}
}
//*/


/*
package ex02.operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// 단항 연산자 : ++, --, ~,......
		
		int x = 10, y ;
		
		y = x++;   // 대입먼저, 증감나중
//		y = --x ;   // 증감먼저, 대입나중
		
//		x++;
//		y = x;
		
		System.out.println(x + ", " + y);
		
		int a = -7, result ;
		result = ~a; 
		
		System.out.println(a + ", 비트부정: " + result);
		//   -(원래값+1)
		
		
		
	}
}
//*/









