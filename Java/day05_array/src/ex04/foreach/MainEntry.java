package ex04.foreach;

public class MainEntry {
	public static void main(String[] args) {
		 //for(자료형 변수명 : 배열명 또는 컬렉션명) { 반복실행문; }
		
		int[] a = {1, 2, 5, 6, 7, 90, 100 };
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n====================");
		
		for (int item : a) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n====================");
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(a[i] + " ");
		}
	}
}








