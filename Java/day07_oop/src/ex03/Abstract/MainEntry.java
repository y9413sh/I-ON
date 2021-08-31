package ex03.Abstract;

abstract class Shape { //추상클래스, Super class
	double result = 0;
	public abstract double calc();
	public abstract void draw();
	public void show() {
		System.out.println("Super class Shape");
	}
}

class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이 : " + calc() + " 인 원을 그렸습니다.");
	}
	
}

class Triangle extends Shape {
	int w=10, h=20;
	
	@Override
	public double calc() {
		result = (w*h)/2;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("삼각형의 넓이 : " + calc() + " 인 삼각형을 그렸습니다.");
	}
	
}

class Rectangle extends Shape {
	
	int x=10, y=10;
	
	@Override
	public double calc() {
		double result=x*y;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("사각형의 넓이 : " + calc() + " 인 삼각형을 그렸습니다.");
	}
	
	
}

public class MainEntry {
	public static void main(String[] args) {
		Shape s = new Triangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.draw();
		t.draw();
		r.draw();
	}
}
