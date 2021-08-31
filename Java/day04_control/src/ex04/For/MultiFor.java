package ex04.For;

public class MultiFor {
	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.print(j + "\t");
			} // j end
			System.out.println();
		} // i end

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
	}
}
