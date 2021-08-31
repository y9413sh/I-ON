package homework;

import java.util.Scanner;

public class Score_method {
	public static void main(String[] args) {
		input();	
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ����, ���� ������ �Է��Ͻÿ� : ");
		String name = sc.next();
		int kor = sc.nextInt();  // 0~100�� ���� �� ����
		int eng = sc.nextInt();  // ����, �Ǽ��� ó�� 
		int com = sc.nextInt();
		
		System.out.println("�̸� : "+name);
		System.out.println("kor : "+kor ); // �� ���� ���� 
		System.out.println("���� : "+total(kor,eng,com));
		System.out.printf("��� : %.2f\n",average(kor,eng,com));
		System.out.println("����(����) : "+grade(average(kor,eng,com)));
	}
	public static int total(int kor, int eng, int com) {
		int total = kor+eng +com;
		return total;
	}
	public static double average(int kor, int eng, int com) {
		double avg = ((double)(kor+eng+com)/3);
		return avg;
	}
	public static char grade(double score) {
		char grade = ' ';
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80){
			grade = 'B';
		}
		else if(score>=70){
			grade = 'C';
		}
		else if(score>=60){
			grade = 'D';
		}
		else {
			grade='F';
		}
		return grade;
	}
}
