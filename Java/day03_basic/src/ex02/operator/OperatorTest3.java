/*
package ex02.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		// 논리 연산자 : 2진 논리 ==> 결과 : 값,   10진 논리 ==> 결과: true, false
		int x = 4, y = 7;
		
		System.out.println(x & y);  // 4
		System.out.println(4 & 7);
		System.out.println(x | y);  // 7
		System.out.println(x ^ y);  // 3
		
		boolean flag = false;
		int a = 10, b = 20, c = 30;
		
		flag = (a < b) && ( b < c );   // '&&' 연산은 앞에 '거짓'이면 뒤는 수행하지 않는다.
		System.out.println(flag); 
		
		flag = (a > b) && ( b > c );  
		System.out.println(flag); 
		
		flag = (a < b) || ( b < c );   // '||' 연산은 앞에 것이 '참'이면 뒤는 수행하지 않는다.
		System.out.println(flag); 
		
		flag = (a > b) || ( b > c );  
		System.out.println(flag); 
		
		
	}
}
//*/


//*
package ex02.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 :  (조건) ? 참 : 거짓 ;
		
		int x = 30, result, y = 5, z= 7;
		
		
		//result = ( x == 3 ) ? x : 0;
		
		result = ( x < y ) ? x :  
										( y > z ) ? y : z;
		
		System.out.println(result);
		
		
		// 대입(배정)연산자 : =, +=, *=, /= , <<=, >>=,.....
		x = 8;
		//x = x + y;   
		x += y;
		System.out.println(x);
		//x = x * y;
		x *= y;
		System.out.println(x);
		
		x = x + 1;
		x += 1;
		x++;
	}
}
//*/

// 0, 0.0, NULL 을 제외한 모든 것은 참이다.   




















