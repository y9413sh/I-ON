package ex05.Interface;

interface A { // interface - abstract method, final field 만 갖는다.
	int x = 99; // final static int x = 99;
	final int y = 777;
	char ch = 'A';
	
	// 추상메소드, abstract 생략가능함 - 무조건 추상메소드임
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

// interface 간에 상속에서도 extends 키워드 사용한다.
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
//		x = 8; 값 변경 금지		
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












