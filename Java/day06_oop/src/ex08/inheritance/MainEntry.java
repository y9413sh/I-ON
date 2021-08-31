package ex08.inheritance;

class Point {
	protected int x , y;
	
	public Point() { x = y = 10;	}
	public Point(int x, int y) {this.x = x;	this.y = y;	}
	public Point(int x) {	this.x = x;	}
	public int getX() {		return x;	}
	public void setX(int x) {	this.x = x;	}
	public int getY() {		return y;	}
	public void setY(int y) {	this.y = y;	}	
	public void disp() {
		System.out.print("x = " + x + ", y = " + y);
	}
} // Point end

class Circle extends Point {  // ��� - extends 
	private int r;
//	Point pt; 
	
	
	public Circle() {
//		pt = new Point();
//		pt.setX(0);		pt.setY(0);		r = 0;
	}
	public Circle(int x, int y) {
		super(x, y);
		x = y = 100;
		r = 5;
	}
	public Circle(int x) {
		super(x);
		//this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public int getR() {	return r;	}
	public void setR(int r) {	this.r = r;	}
	public void disp() {
		super.disp();  // �θ�(Point)�� ���� �ִ� disp() �޼ҵ� ȣ���Ѱ���
		System.out.println(", r = " + r);		
//		System.out.print("x = " + x + ", y = " + y + ", r = " + r);
	}
} // Circle end

// �簢�� Ŭ���� ����� - Point ��� �޾Ƽ� �����ϱ� 

public class MainEntry {
	public static void main(String[] args) {
		// �簢�� ��ü �����ؼ� ���
		
		Circle c = new Circle();
		c.disp();
		Circle c2 = new Circle(10, 20);
		c2.disp();
		
//		Point pt = new Point(1, 2);
//		pt.disp();
	}
}



