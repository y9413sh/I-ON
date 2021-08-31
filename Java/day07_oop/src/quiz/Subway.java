package quiz;

public class Subway extends Transport {

	public String name() {
		return "지하철";
	}
	
	@Override
	public void start() {
		System.out.println(name() + "이 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println(name() + "이 정지합니다.");

	}

}
