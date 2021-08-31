package quiz;

import java.util.Iterator;

/*
 	문제] 1~100 중에서 3의 배수의 개수와 합을 구하세요.
 */

public class Quiz_Control {
	public static void main(String[] args) {
		int sum=0, count=0;
		
		for(int i=1; i < 101; i++) {
			
			if( i % 3 == 0 ) {
				sum += i;  // sum = sum + i;
				count++;   // count = count + 1;  // count += 1;
			} // if end
		} // for end
		
		System.out.println("1~100 중에서 3의 배수의 개수: " + count + " 와 합: " + sum + "입니다");
	}
}
