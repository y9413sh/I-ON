package ex04.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// �迭 �̿��� ����
		Shape[] ss = new Shape[3];
		ss[0]=new Circle();
		ss[1]=new Rectangle();
		ss[2]=new Triangle();
		String[] name = { "circle", "rectangle", "triangle" };
		for(int i=0; i<ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println();
		// Shape �θ� �߻� Ŭ������ �̿��ؼ� ��ü ����
		Shape sh = new Circle();
		sh.show("Circle Circle");
		sh=new Rectangle();
		sh.show("Rectangle");
		sh=new Triangle();
		sh.show("Triangle");
		
		System.out.println();
		// ���� Ŭ���� ����
		Circle c = new Circle();
		c.show("��");
		Rectangle r=new Rectangle();
		r.show("�簢��");
		Triangle t = new Triangle();
		t.show("�ﰢ��");
		
		Shape s = new Circle(); // ������
		s.show("circle");
		
	}
}
