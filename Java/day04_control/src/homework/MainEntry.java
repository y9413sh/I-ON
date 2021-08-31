package homework;

import java.util.Scanner;

//성적처리 프로그램 작성
//3과목(국어,영어,전산) 점수 입력 받고, 이름 입력 받아서 총점, 평균, 평점(학점) 구하기
//점수는 0~100점 사이값만 입력 받기
//계속 할지에 대한 유무도 넣기 (y/n) 구분해서 프로그램 처리 하기
public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl + shift + O , 입력그릇 생성
		int kor, eng, com, tot = 0;
		double avg = 0;
		String name = "" , str = null ; // null
		//char yn = ' ';

		while (true) {  // 무한루프
			System.out.print("name = ");
			name = sc.next(); // next() vs nextLine()
			
//			do {
//				System.out.print("kor, com = ");
//				kor = sc.nextInt();
//				com = sc.nextInt();
//			} while (kor < 0 || kor > 101 || com < 0 || com > 101);

			do {
				System.out.print("kor = ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 101);

			do {
				System.out.print("com = ");
				com = sc.nextInt();
			} while (com < 0 || com > 101);

			tot = kor + com;
			avg = tot / 2.;
			
			// 학점(평점) 
			

			System.out.println("\n\n" + name + "님의 성적표******************");
			System.out.println("Kor : " + kor + "\tCom : " + com);
			System.out.println("Tot : " + tot + "\tAvg : " + avg);

			System.out.println("더 입력하시겠어요? (y/n) ");
			//yn = sc.next().charAt(0);
			str = sc.next();

			//if( yn == 'n' || yn == 'N' ) break;
			//if( str.toUpperCase() == "N" ) break;
			//if( str.equals("n") || str.equals("N")) break;
			if( str.equalsIgnoreCase("n") ) break;
			//if( str.equalsIgnoreCase("y") ) continue;

		} // end while
	}
}







