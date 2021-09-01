package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 : 성적 입력 \t 2 : 성적 출력 \t 0 : 종료");
			int controller = sc.nextInt();
			switch (controller) {
			case 0:
				break;
			case 1: // 고객 추가
				create(list);
				continue;
			case 2: // 고객 삭제
				read(list);
				continue;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
	}

	public static void create(List<Score> list) {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();

		System.out.print("학생 이름 : ");
		score.setName(sc.nextLine());
		System.out.print("국어 점수 : ");
		score.setKor(sc.nextInt());
		System.out.print("영어 점수 : ");
		score.setEng(sc.nextInt());
		System.out.print("수학 점수 : ");
		score.setMath(sc.nextInt());
		score.setTot(score.getKor(), score.getEng(), score.getMath());
		score.setAvg(score.getTot());
		score.setGrade(score.getAvg());

		list.add(score);
	}

	public static void read(List<Score> list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

}