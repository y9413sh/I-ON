package ex04.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
	@Bean
	public Student student() {
		Student student = new Student("ȫ�浿", "���л�", "������б�");
		return student;
	}

	@Bean
	public Worker worker() {
		Worker worker = new Worker("�浿��", "ȸ���", "���̿�Ŀ�´����̼���");
		return worker;
	}
	
	@Bean
	public StudentShowImpl studentShow() {
		StudentShowImpl stdShow = new StudentShowImpl();
		stdShow.setStudent(student());
		
		return stdShow;
	}
	
	@Bean
	public WorkerShowImpl workerShow() {
		WorkerShowImpl wkShow = new WorkerShowImpl();
		wkShow.setWorker(worker());
		return wkShow;
	}
}
