package quiz2;

public class Bus implements Transport {
	String name="버스";
	public void start() {
		System.out.println(name + "이 출발합니다.");
	}
	public void stop() {
		System.out.println(name + "이 정지합니다.");
	}
}
