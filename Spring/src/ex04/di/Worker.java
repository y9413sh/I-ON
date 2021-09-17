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
		return super.getName() + "���� �̵� ���Դϴ�.";
	}

	@Override
	public String sleep() {
		return super.getName() + "���� �ڴ� ���Դϴ�..";
	}

	@Override
	public String eat() {
		return super.getName() + "���� �Դ� ���Դϴ�.";
	}

	public void workerInfo() {
		System.out.println("�̸� : " + super.getName());
		System.out.println("���� : " + super.getJob());
		System.out.println("ȸ�� : " + this.company);
	}
}
