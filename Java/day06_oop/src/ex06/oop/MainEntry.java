package ex06.oop;

// ���������� : private < default < protected < public 

class Point { //extends Object {
	private int x, y;  // ������� - int :0 , double : 0.0, String : NULL
	
	public void setXY(int xx, int yy) {
		x = xx;		y = yy;
	}
	// constructor method
	public Point(int x, int y) {   // �Ű����� 2��¥�� �������Լ� 
		this.x = x;
		this.y = y;    
	}
	public Point() {	// �Ű����� ���� �������Լ� - ����Ʈ �������Լ� 
//		x = y = 100;	
//		System.out.println("Point() call ");
		this(10, 20);  // ù �ٿ� �;���
		System.out.println("Point() call ");
	}
	public Point(int x) {   // �Ű����� 1��¥�� �������Լ� 
		this(x, 999);
//		this.x = x;
//		y = 999;
	}
	public void setX(int xx) {	x = xx;	}	
	public int getX() {	return x;	}
	
	public void setY(int yy) {	y = yy;	}	
	public int getY() {	return y;	}
	
	public void display() {
		//System.out.println(x + ", "+ y);
		System.out.println(getX() + ", " + getY());
	}
	
} // Point end


public class MainEntry {
	public static void main(String[] args) {
//		int x=999 ; 
//		System.out.println(x);
		Point pt2 = new Point(2222);  // �������Լ� 1ȸ�� ��밡��
		pt2.display();
		
		Point pt4 = new Point();
		pt4.display();
		
		Point pt3 = new Point(1, 2);
		pt3.display();
		
		System.out.println("=================");
		Point pt = new Point(); // ��ü����, �޸𸮿��Ҵ�, �������Լ� �ڵ�ȣ��
		pt.display();  // �ʱⰪ ��� 
//		pt.setXY(12, 13);
//		pt.setX(200);		pt.setY(300);		pt.display();
//		pt.setXY(100, 13);
//		pt.setX(10);		pt.display();
		
//		System.out.println(pt.x + ", " + pt.y); // �ʱⰪ Ȯ��
//		pt.x = 9;
//		pt.y = 8;
//		System.out.println(pt.x + ", " + pt.y);
	}
}
