package ex05.sort;
// 기준이 있고,
// 뒤에 것이 작으면 자리 바꾼다.
public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		int temp;
		
		System.out.println("******* 소트 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
			
				if( a[i] > a[j] ) {  // 교환
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			} // j end
			
		} // i end
		
		System.out.println("\n\n******* 소트 후 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}












