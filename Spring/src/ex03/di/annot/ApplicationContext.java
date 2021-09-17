package ex03.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //spring ������ ���Ǵ� Ŭ�������� ��� == ctx.xml
public class ApplicationContext {
	
	@Bean
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("�ڲ���");
		hobbys.add("�߱���");
		
		MyCats myCats = new MyCats("��Ű", 13, hobbys);
		myCats.setWeight(15.3);
		myCats.setColor("brown");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("�չߵ��");
		hobbys.add("��ũ�ϱ�");
		
		MyCats myCats = new MyCats("�Ŀ���", 2, hobbys);
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
