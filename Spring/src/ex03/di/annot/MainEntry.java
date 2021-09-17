package ex03.di.annot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		catsInfo.catsInfoPrint();
		
		MyCats cat2 = ctx.getBean("cat2", MyCats.class);
		catsInfo.setMyCats(cat2);
		catsInfo.catsInfoPrint();
		
		MyCats cat1 = ctx.getBean("cat1", MyCats.class);
		catsInfo.setMyCats(cat1);
		catsInfo.catsInfoPrint();
		
		
//		org.springframework.context.ApplicationContext ctx2 = new ClassPathXmlApplicationContext("ex03/di/annot/appContext.xml");

		String configcontext = "classpath:ex03/di/annot/appContext.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		
		MyCats myCats = context.getBean("cat3", MyCats.class);
		Cats cats = context.getBean("cats", Cats.class);
		
		cats.setMyCats(myCats);
		cats.catsInfoPrint();
		
		context.close();
	}
}
