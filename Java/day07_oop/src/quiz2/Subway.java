package quiz2;

public class Subway implements Transport {
	String name="지하철";
	public void start() {
		System.out.println(name + "이 출발합니다.");
	}
	public void stop() {
		System.out.println(name + "이 정지합니다.");
	}
}
