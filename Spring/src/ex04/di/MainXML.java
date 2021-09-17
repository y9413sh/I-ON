package ex04.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex04/di/ctx.xml");
		
		Student student = ctx.getBean("student", Student.class);
		Worker worker = ctx.getBean("worker", Worker.class);
		
		StudentShowImpl sShow = ctx.getBean("studentShow", StudentShowImpl.class);
		WorkerShowImpl wShow = ctx.getBean("workerShow", WorkerShowImpl.class);
		
		sShow.output();
		wShow.output();
		
		
	}
}
