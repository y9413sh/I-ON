package ex04.Abstract;

public class Triangle extends Shape {
	int w=100;
	
	@Override
	public double calc(double x) {
		result = (x*w) /2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + "ũ���� " + name + "�� �׷������ϴ�.");
	}

}
