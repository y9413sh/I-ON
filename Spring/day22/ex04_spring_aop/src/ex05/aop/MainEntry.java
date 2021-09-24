package ex05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.edu.kosta.Student;
import kr.edu.kosta.Worker;

public class MainEntry {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ex05/aop/ctx.xml");

		Student stu = context.getBean("student", Student.class);
		Worker emp = context.getBean("employee", Worker.class);

		stu.print();
		emp.print();

	}
}
