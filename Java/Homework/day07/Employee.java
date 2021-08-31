package homework;

public class Employee {
	private String name;
	private String tel;
	private String div;
	private String rank;
	
	public Employee(String name, String tel, String div, String rank) {
		this.name=name;
		this.tel=tel;
		this.div=div;
		this.rank=rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
