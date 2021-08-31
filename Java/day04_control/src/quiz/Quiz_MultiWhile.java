package quiz;

public class Quiz_MultiWhile {
	public static void main(String[] args) {
		// while 구문 이용해서 구구단 전체 출력
		System.out.println("구구단 출력");
		int i = 2;
		int j = 1;

		while (i < 10) {
			System.out.println(i + "단");
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			i++;
			j = 1;
			System.out.println("------------------");
		}
	}
}
