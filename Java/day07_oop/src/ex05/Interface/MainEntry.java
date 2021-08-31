package ex05.Interface;

interface A { // interface - abstract method, final field �� ���´�.
	int x = 99; // final static int x = 99;
	final int y = 777;
	char ch = 'A';
	
	// �߻�޼ҵ�, abstract ���������� - ������ �߻�޼ҵ���
	public void show();  // public abstract void show();
	public abstract void disp();	
} // A end

interface B {
	void bView();
}

interface C {
	String name = "happy";
	public void cDraw();
}

// interface ���� ��ӿ����� extends Ű���� ����Ѵ�.
interface D extends B {
	void dView();
}

class Rect implements D {

	@Override
	public void bView() {  // B
		
	}

	@Override
	public void dView() {  // D
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect end

class Shape {
	
}

class Multi extends Shape implements B, C, A {  //
//class Multi implements B, C, A extends Shape  {  //

	@Override
	public void show() {
		System.out.println(x);
//		x = 8; �� ���� ����		
	}

	@Override
	public void disp() {
		System.out.println("A interface ");		
	}

	@Override
	public void cDraw() {
		System.out.println("C interface");
		
	}

	@Override
	public void bView() {
		System.out.println("B interface");
		
	}
	
}

class Point implements A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

class Circle implements C {

	@Override
	public void cDraw() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		B b = new Multi();
		b.bView();
		
		A a = new Multi();
		a.disp();
		
		Multi m = new Multi();
		m.cDraw();		m.disp();
		
		Circle c  = new Circle();
		c.cDraw();
	}
}












