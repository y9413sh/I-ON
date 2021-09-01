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
			System.out.println("1 : ���� �Է� \t 2 : ���� ��� \t 0 : ����");
			int controller = sc.nextInt();
			switch (controller) {
			case 0:
				break;
			case 1: // �� �߰�
				create(list);
				continue;
			case 2: // �� ����
				read(list);
				continue;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;
		}
	}

	public static void create(List<Score> list) {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();

		System.out.print("�л� �̸� : ");
		score.setName(sc.nextLine());
		System.out.print("���� ���� : ");
		score.setKor(sc.nextInt());
		System.out.print("���� ���� : ");
		score.setEng(sc.nextInt());
		System.out.print("���� ���� : ");
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