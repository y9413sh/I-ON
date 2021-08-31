package homework;

public class Sales extends Regular {

	private int pay;
	private int cnt;
	private double com=0.03;
	
	public Sales(String name, String tel, String div, String rank, int pay, int cnt) {
		super(name, tel, div, rank);
		this.pay=pay;
		this.cnt=cnt;
	}

	public int getPay() {
		pay=(int)(pay+(pay*cnt*com));
		return pay;
	}
	
	@Override
	public String toString() {
		return "영업직 급여 : " + getPay();
	}
}
