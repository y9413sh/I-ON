package homework;

public class Customer {
	
	private int id;
	private String name;
	private String address;
	private String tel;
	
	Customer() {
		
	}
	
	Customer(String name, String address, String tel) {
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	
	@Override
	public String toString() {
		return "--°í°´ Á¤º¸--"
				+ "\n id= " + id
				+ "\n name= " + name
				+ "\n address= " + address
				+ "\n tel= " + tel;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
