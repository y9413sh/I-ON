package quiz;

public class Airplane extends Transport {

	public String name() {
		return "�����";
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
