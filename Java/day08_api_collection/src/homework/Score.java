package homework;

public class Score {
	String name;
	int kor, eng, math;
	int tot;
	double avg;
	char grade;
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}
	
	public void setTot(int kor, int eng, int math) {
		this.tot=kor+eng+math;
	}

	public double getAvg() {
		avg=tot/3;
		return avg;
	}
	
	public void setAvg(int tot) {
		this.avg=tot/3;
	}
	
	public void setGrade(double avg) {
		switch((int)avg/10) {
			case 10:
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
				default : grade='F';
		}
	}
	
	public char getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "--" + name + "학생 정보--"
				+ "\n kor= " + kor
				+ "\n eng= " + eng
				+ "\n math= " + math
				+ "\n tot= " + tot
				+ "\n avg= " + avg
				+ "\n grade= " + grade;
	}
}
