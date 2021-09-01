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
		System.out.println(r); // �ش� ��ü�� �޸� ��ġ ���
		System.out.printf("�޸� ��ġ�� 10������ ǥ�� %d\n", 0x7de26db8);
		System.out.println(r.hashCode());
		System.out.println(r.toString());
	}
}
