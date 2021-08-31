package homework;

public class Regular extends Employee {

	private int pay;
	
	public Regular(String name, String tel, String div, String rank) {
		super(name, tel, div, rank);
	}
	
	public Regular(String name, String tel, String div, String rank, int pay) {
		super(name, tel, div, rank);
		this.pay=pay;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "정규직 급여 : " + getPay();
	}
	
}
