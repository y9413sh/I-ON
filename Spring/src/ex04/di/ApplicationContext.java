package ex04.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
	@Bean
	public Student student() {
		Student student = new Student("홍길동", "대학생", "서울대학교");
		return student;
	}

	@Bean
	public Worker worker() {
		Worker worker = new Worker("길동이", "회사원", "아이온커뮤니케이션즈");
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
