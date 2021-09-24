package ex05.spring.aop;

public class Student implements Print {
	private String name, grade, group;
	private int age;

	public Student() {
	}

	public Student(String name, String grade, String group, int age) {
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void show() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 성적 : " + grade + " 반 : " + group);
	}

}
