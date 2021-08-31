package ex08.api;

class Point {}


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode()); // 2111991224 (10����)
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt); // 7de26db8 (16����)
		System.out.printf("10���� %d\n", 0x20); // 0x����:16����, 0����:8����
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode()); // 2111991224 (10����)
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2); // 7de26db8 (16����)
		System.out.println("pt2.toString() : toString()�� �ǹ�");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));

		Point pt3 = new Point();
		
		if(pt.hashCode() == pt3.hashCode() ) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		Point pt4;
		pt4 = pt;
		
		if(pt.hashCode() == pt4.hashCode() ) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
