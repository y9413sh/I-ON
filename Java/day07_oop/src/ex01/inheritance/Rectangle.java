package ex01.inheritance;

public class Rectangle extends Point {
	
	private int x2, y2;

	public Rectangle(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rectangle() {
		x2 = y2 = 90;
		System.out.println("Rect call");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Rectangle [x2=" + x2 + ", y2=" + y2 + ", x=" + x + ", y=" + y + "]";
	}
	
	// output method
//	public void disp() {
//		super.disp(); // 부모(Point)가 갖고 있는 출력메소드 호출
//		System.out.println(", " + x2 + ", " + y2);
//	}

}
