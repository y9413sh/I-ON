package ex06.oop;

// 접근지정자 : private < default < protected < public 

class Point { //extends Object {
	private int x, y;  // 멤버변수 - int :0 , double : 0.0, String : NULL
	
	public void setXY(int xx, int yy) {
		x = xx;		y = yy;
	}
	// constructor method
	public Point(int x, int y) {   // 매개변수 2개짜리 생성자함수 
		this.x = x;
		this.y = y;    
	}
	public Point() {	// 매개변수 없는 생성자함수 - 디폴트 생성자함수 
//		x = y = 100;	
//		System.out.println("Point() call ");
		this(10, 20);  // 첫 줄에 와야함
		System.out.println("Point() call ");
	}
	public Point(int x) {   // 매개변수 1개짜리 생성자함수 
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
		Point pt2 = new Point(2222);  // 생성자함수 1회만 사용가능
		pt2.display();
		
		Point pt4 = new Point();
		pt4.display();
		
		Point pt3 = new Point(1, 2);
		pt3.display();
		
		System.out.println("=================");
		Point pt = new Point(); // 객체생성, 메모리에할당, 생성자함수 자동호출
		pt.display();  // 초기값 출력 
//		pt.setXY(12, 13);
//		pt.setX(200);		pt.setY(300);		pt.display();
//		pt.setXY(100, 13);
//		pt.setX(10);		pt.display();
		
//		System.out.println(pt.x + ", " + pt.y); // 초기값 확인
//		pt.x = 9;
//		pt.y = 8;
//		System.out.println(pt.x + ", " + pt.y);
	}
}
