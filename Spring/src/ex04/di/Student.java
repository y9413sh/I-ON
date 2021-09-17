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

	public void studentInfo() {
		System.out.println("이름 : " + super.getName());
		System.out.println("직업 : " + super.getJob());
		System.out.println("회사 : " + this.school);
	}
}
