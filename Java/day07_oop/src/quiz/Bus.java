package quiz;

public class Bus extends Transport {

	public String name() {
		return "버스";
	}
	
	@Override
	public void start() {
		System.out.println(name() + "이(가) 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println(name() + "이(가) 정지합니다.");

	}
}
