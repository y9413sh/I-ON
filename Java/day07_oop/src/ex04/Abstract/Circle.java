package ex04.Abstract;

public class Circle extends Shape {
		
	@Override
	public double calc(double x) {
		result =  x*x*Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + "ũ���� " + name + "�� �׷������ϴ�.");
	}

}
