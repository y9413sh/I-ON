package ex03.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //spring 설정에 사용되는 클래스임을 명시 == ctx.xml
public class ApplicationContext {
	
	@Bean
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("꾹꾹이");
		hobbys.add("뒹굴기");
		
		MyCats myCats = new MyCats("쿠키", 13, hobbys);
		myCats.setWeight(15.3);
		myCats.setColor("brown");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("앞발들기");
		hobbys.add("윙크하기");
		
		MyCats myCats = new MyCats("냐옹이", 2, hobbys);
		myCats.setWeight(2.3);
		myCats.setColor("white");
		
		return myCats;
	}
	
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
}
