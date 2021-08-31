package quiz;

import java.util.Scanner;

//성적처리 프로그램 작성
// 7명의 데이터 3과목 입력 받아서 총점/평균/학점까지 구하는 프로그램 작성 (배열로처리할것)

public class MainEntry {
	public static void main(String[] args) {
		int INWON = 3;
		Scanner input = new Scanner(System.in);

		String[] sub = { "국어", "영어", "전산" };
		char[] grade = { 'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A' };

		String[] name = new String[INWON];
		int[][] score = new int[INWON][3];  // 인원수,과목수
		int[] sum = { 0,0,0,0,0,0,0 }; // 총점변수
		
		// 입력 받기
		for (int n = 0; n < INWON; n++) {
			System.out.println("이름을 입력하세요 : ");
			name[n] = input.next();
			
			for (int i = 0; i < score[n].length; i++) {  // 점수 입력 받기
				do {
					try { // 문자열 예외 처리
						System.out.print(sub[i] + "점수 : (1~100) ");
						score[n][i] = input.nextInt();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				} while (score[n][i] < 0 || score[n][i] > 100);  // 0~100 아니면 다시 입력받기

				sum[n] += score[n][i];  // 총점 - 점수 누적
			} // in for end

		} // out for end
		
		
		System.out.println("\n\n");
		// 결과 출력 
		for (int n = 0; n < INWON; n++) {
			System.out.println("****** " +name[n] + "님의 성적표 :*******");
			
			for (int i = 0; i < sub.length; i++) {  // 각과목 점수 출력
				System.out.print(sub[i] + " : " + score[n][i] + " ");
			} // i end
			// 총점,평균, 학점
			System.out.printf("\n총점 : %d , 평균 %.2f , 학점 : %s " , 
						sum[n] , (double) sum[n] / sub.length , grade[sum[n] / (sub.length * 10)]);
			
//			System.out.println("\n총점 : " + sum[n] + ", 평균 %.2f: " + (double) sum[n] / sub.length + ", 학점 : "
//					+ grade[sum[n] / (sub.length * 10)]);
			System.out.println();
		} // n end

	}
}
