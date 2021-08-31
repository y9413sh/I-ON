package ex04.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 배열 이용한 형태
		Shape[] ss = new Shape[3];
		ss[0]=new Circle();
		ss[1]=new Rectangle();
		ss[2]=new Triangle();
		String[] name = { "circle", "rectangle", "triangle" };
		for(int i=0; i<ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println();
		// Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle Circle");
		sh=new Rectangle();
		sh.show("Rectangle");
		sh=new Triangle();
		sh.show("Triangle");
		
		System.out.println();
		// 각자 클래스 형태
		Circle c = new Circle();
		c.show("원");
		Rectangle r=new Rectangle();
		r.show("사각형");
		Triangle t = new Triangle();
		t.show("삼각형");
		
		Shape s = new Circle(); // 다형성
		s.show("circle");
		
	}
}
