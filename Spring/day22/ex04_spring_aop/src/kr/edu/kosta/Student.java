package kr.edu.kosta;

public class Student {
	
	private String name;
	private String age;
	private String job;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
	}
}
