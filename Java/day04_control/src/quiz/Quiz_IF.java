package quiz;

import java.util.Scanner;

/*
  전산, 영어, 국어 입력 받아서 평균 60점 이상이고,
  각 과목 과락 40점이하이면 과목 불합격
 */
public class Quiz_IF {
	public static void main(String[] args) {
		System.out.print("kor = ");		int kor = new Scanner(System.in).nextInt();
		System.out.print("eng = ");		int eng = new Scanner(System.in).nextInt();
		System.out.print("com = ");		int com = new Scanner(System.in).nextInt();
		/*double avg = (double)( kor + eng + com ) / 3 ;*/
		double avg = ( kor + eng + com ) / 3.0 ;

		//if ( avg >= 60 && kor >= 40 && eng >= 40 && com >= 40 ) { 
		if ( avg >= 60 ) {  //3과목 평균 60점이상이어야함
			if ( kor >= 40 && eng >= 40 && com >= 40 ){
				System.out.printf("모든 과목이 40점 이상이며, "
						+ "평균이 %.2f 로 [합격] 입니다\n" , avg );
			} else {
				System.out.printf("평균은 %.2f 이지만, " , avg );	
				if ( kor < 40 ) System.out.print("국어 " + kor + " 점 "  );
				if ( eng < 40 ) System.out.print("영어 " + eng + " 점 "  );
				if ( com < 40 ) System.out.print("전산 "+ com +" 점 "  );
				System.out.printf("으로 [과락 탈락] 입니다 \n ");
			} // in if end
		} else {
			System.out.printf("평균이 %.2f 로 [평균 미달 탈락] 입니다 \n ", avg );
		} //out if end
	}
}
