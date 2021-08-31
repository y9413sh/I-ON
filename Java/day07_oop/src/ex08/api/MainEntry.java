package ex08.api;

class Point {}


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode()); // 2111991224 (10진수)
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt); // 7de26db8 (16진수)
		System.out.printf("10진수 %d\n", 0x20); // 0x숫자:16진수, 0숫자:8진수
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode()); // 2111991224 (10진수)
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2); // 7de26db8 (16진수)
		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));

		Point pt3 = new Point();
		
		if(pt.hashCode() == pt3.hashCode() ) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		Point pt4;
		pt4 = pt;
		
		if(pt.hashCode() == pt4.hashCode() ) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
