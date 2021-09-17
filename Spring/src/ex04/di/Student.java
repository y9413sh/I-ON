package ex04.di;

public class Student extends Common implements Person {

	private String school;
	
	public Student() { }

	public Student(String name, String job, String school) {
		super(name, job);
		this.school=school;
		// TODO Auto-generated constructor stub
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
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

	public void studentInfo() {
		System.out.println("�̸� : " + super.getName());
		System.out.println("���� : " + super.getJob());
		System.out.println("ȸ�� : " + this.school);
	}
}
