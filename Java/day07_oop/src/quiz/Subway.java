package quiz;

public class Subway extends Transport {

	public String name() {
		return "����ö";
	}
	
	@Override
	public void start() {
		System.out.println(name() + "�� ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name() + "�� �����մϴ�.");

	}

}
