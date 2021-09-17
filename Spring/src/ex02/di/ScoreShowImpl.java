package ex02.di;

import java.util.Scanner;

public class ScoreShowImpl implements ScoreShow {
	
	private ScoreImpl score;
	
	
	public void setScore(ScoreImpl score) {
		this.score = score;
	}

	public ScoreShowImpl(ScoreImpl score) {
		super();
		this.score = score;
	}

	@Override
	public void print() {
		System.out.println("���� : " + score.getKor());
		System.out.println("���� : " + score.getEng());
		System.out.println("���� : " + score.getCom());
		System.out.println("���� : " + score.total());
		System.out.println("��� : " + score.avg());
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kor, eng, com = ");
		score.setKor(sc.nextInt());
		score.setEng(sc.nextInt());
		score.setCom(sc.nextInt());
		
	}

}
