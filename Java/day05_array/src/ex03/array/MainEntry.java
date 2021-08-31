package ex03.array;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		int[][][] a = new int[2][2][3]; // 면,행,열
		int x = 0;

		System.out.println("면= " + a.length);
		System.out.println("행= " + a[0].length);
		System.out.println("행= " + a[0][0].length);

		// input
		for (int i = 0; i < a.length; i++) { // 면

			for (int j = 0; j < a[i].length; j++) { // 행

				for (int k = 0; k < a[i][j].length; k++) { // 열
					//a[i][j][k] = ++x;
					//a[i][j][k] = x += 10;
					//a[i][j][k] = (int)(Math.random() * 100);  // 0 ~ n-1 ==> 0 ~ 99 사이값
					a[i][j][k] = new Random().nextInt(45) + 1;  // 0 ~ n-1 ==> 0 ~ 44 사이값 추출됨
				}
			}
		}
		
		// output
		for (int i = 0; i < a.length; i++) { // 면

			for (int j = 0; j < a[i].length; j++) { // 행

				for (int k = 0; k < a[i][j].length; k++) { // 열
					System.out.print(a[i][j][k] + "\t");
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end

	}
}
