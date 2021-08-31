package homework;

public class PartTime extends Employee {

	private int day, time, minwage=8720; //최저시급 8,720
	private int pay;
	
	public PartTime(String name, String tel, String div, String rank, int day, int time) {
		super(name, tel, div, rank);
		this.day=day;
		this.time=time;
	}

	public int getPay() {
		pay=day*time*minwage;
		return pay;
	}
	
	@Override
	public String toString() {
		return "파트타임 급여 : " + getPay();
	}
}
