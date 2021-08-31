package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_switch2 {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {  //예외처리 위임
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int math, eng, kor;
		int total;
		double avg;

		System.out.print("수학 : ");
		math = Integer.parseInt(br.readLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(br.readLine());

		//total = math + eng + kor;
		avg = (double) (math + eng + kor) / 3;

		switch ((int) avg / 10) {
			case 10:	case 9:		case 8:		case 7:
			case 6:
				switch (math <= 40 ? "math" : eng <= 40 ? "eng" : kor <= 40 ? "kor" : "") {
				case "math":
					System.out.println("수학 점수가 40점 이하이므로 불합격입니다.");
					break;
				case "eng":
					System.out.println("영어 점수가 40점 이하이므로 불합격입니다.");
					break;
				case "kor":
					System.out.println("국어 점수가 40점 이하이므로 불합격입니다.");
					break;
				default:
					System.out.println("합격입니다.");
					break;
				}
				break;
			default:
				System.out.println("평균 60점 미만이므로 불합격입니다.");
				break;
		}
	}
}
