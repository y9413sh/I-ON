package ex04.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		StudentShowImpl studentShow = ctx.getBean("studentShow", StudentShowImpl.class);
		WorkerShowImpl workerShow = ctx.getBean("workerShow", WorkerShowImpl.class);
		Student student = ctx.getBean("student", Student.class);
		Worker worker = ctx.getBean("worker", Worker.class);
		studentShow.input();
		studentShow.setStudent(student);
//		student.move();
//		student.sleep();
//		student.eat();
//		student.studentInfo();
		workerShow.input();
		workerShow.setWorker(worker);
//		worker.move();
//		worker.sleep();
//		worker.eat();
//		worker.workerInfo();
		
		studentShow.output();
		workerShow.output();
	}
}
