package ex01.inheritance;

public class Circle extends Point {
	
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("Circle 3");
	}

	public Circle(int r) {
		this.r = r;
		System.out.println("Circle 1");
	}

	public Circle() {
		r = 5;
		System.out.println("Circle ");
	}

	public Circle(int x, int y) {
		super(x, y);
		r = 10;
		System.out.println("Circle 2");
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}

	// output method
//	public void disp() {
//		super.disp(); // 부모(Point)가 갖고 있는 출력메소드 호출
//		// System.out.println(x + ", " + y + ", " + r);
//		System.out.println(", " + r);
//	}
	
	
}





