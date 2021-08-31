package ex05.sort;

// 가장 큰것이 뒤에 정렬됨

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		int temp;

		System.out.println("******* 소트 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		// sort
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length-i-1; j++) {

				if (a[j] < a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			} // j end

		} // i end

		System.out.println("\n\n******* 소트 후 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	}
}
