package kr.edu.kosta;

public class Worker {

	private String name;
	private String age;
	private String com;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(com);
	}

}
