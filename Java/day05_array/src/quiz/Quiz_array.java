package quiz;

import java.util.Scanner;

public class Quiz_array {
	public static void main(String[] args) {

			// 2차원 배열에 임의의 데이터 입력 받아서 값 출력, 행끼리 더한 결과 출력
			int[][] b = new int[2][3];
			int sum = 0;
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print("b[" + i + "][" + j + "]에 넣을 정수를 입력하세요 : ");
					b[i][j] = sc.nextInt();
					sum += b[i][j];
				}
				System.out.println();

				for (int j = 0; j < b[0].length; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println((i + 1) + "행의 합 : " + sum);
				sum = 0;
			}

	}
}