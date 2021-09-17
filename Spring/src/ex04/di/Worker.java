package ex04.di;

public class Worker extends Common implements Person {
	
	private String company;
	
	public Worker() { }

	public Worker(String name, String job, String company) {
		super(name, job);
		this.company=company;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String move() {
		return super.getName() + "님이 이동 중입니다.";
	}

	@Override
	public String sleep() {
		return super.getName() + "님이 자는 중입니다..";
	}

	@Override
	public String eat() {
		return super.getName() + "님이 먹는 중입니다.";
	}

	public void workerInfo() {
		System.out.println("이름 : " + super.getName());
		System.out.println("직업 : " + super.getJob());
		System.out.println("회사 : " + this.company);
	}
}
