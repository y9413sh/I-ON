package ex05.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "classpath:ex05/spring/aop/appCtx.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Student stu = context.getBean("student", Student.class);
		stu.show();
	}
}
