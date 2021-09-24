package ex04.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String config = "classpath:ex04/spring/aop/ctx.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		MessageBean bean = context.getBean("messageBean", MessageBean.class);
		bean.sayHello();
		System.out.println("------------------------------------------");
		bean.engHello();
		System.out.println("\n------------------------------------------");
		BookBean book = context.getBean("bookBean", BookBean.class);
		book.testHello("¾È³ç");
		book.korHello();
	}
}
