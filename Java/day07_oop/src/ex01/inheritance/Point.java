package ex01.inheritance;

public class Point {  // extends Object {
	protected int x, y;

	// constructor method
	public Point() {
//		this(0, 0);
		x = y = 7;
		System.out.println("default construtor call");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2");
	}

	public Point(int x) {
		this.x = x;
		y = 999;
		System.out.println("Point 1");
	}
	
	// getter / setter method
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// output method
//	public void disp() {
//		System.out.print(x + ", " + y);
//	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() {
//		return x + ", " + y;
//	}
	
}






