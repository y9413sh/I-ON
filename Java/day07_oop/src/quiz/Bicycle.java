package quiz;

public class Bicycle extends Transport {
	
	public String name() {
		return "������";
	}
	
	@Override
	public void start() {
		System.out.println(name() + "��(��) ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(name() + "��(��) �����մϴ�.");

	}

}
