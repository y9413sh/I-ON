package quiz;

import java.util.Scanner;

public class Quiz_array {
	public static void main(String[] args) {

			// 2���� �迭�� ������ ������ �Է� �޾Ƽ� �� ���, �ೢ�� ���� ��� ���
			int[][] b = new int[2][3];
			int sum = 0;
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print("b[" + i + "][" + j + "]�� ���� ������ �Է��ϼ��� : ");
					b[i][j] = sc.nextInt();
					sum += b[i][j];
				}
				System.out.println();

				for (int j = 0; j < b[0].length; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println((i + 1) + "���� �� : " + sum);
				sum = 0;
			}

	}
}