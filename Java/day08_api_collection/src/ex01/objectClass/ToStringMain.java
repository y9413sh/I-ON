package ex01.objectClass;

class Rectangle {
	int x,y;
	
	public Rectangle() {
		x=y=10;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		return x + ", " + y;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r); // 해당 객체의 메모리 위치 출력
		System.out.printf("메모리 위치값 10진수로 표현 %d\n", 0x7de26db8);
		System.out.println(r.hashCode());
		System.out.println(r.toString());
	}
}
