package ex04.di;

import java.util.Scanner;

public class StudentShowImpl implements PersonShow {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void studentShow(Student student) {
		this.student=student;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Student--------");
		System.out.print("�̸�: ");
		student.setName(sc.next()); sc.nextLine();
		System.out.print("����: ");
		student.setJob(sc.next()); sc.nextLine();
		System.out.print("�б�: ");
		student.setSchool(sc.next()); sc.nextLine();
	}

	@Override
	public void output() {
		System.out.println("--------Student Info--------");
		student.studentInfo();
	}
}
