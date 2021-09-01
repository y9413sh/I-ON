package ex03.string;

public class StringAddress {
	public static void main(String[] args) {
		String s1 = new String("korea");
		String s2 = new String("korea");
		System.out.println(s1 + ", " + s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "korea";
		System.out.println(s3.hashCode());
		
		s3 = "busan";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String msg = "cdefghij";
		System.out.println("daegu " + msg);
		System.out.println(msg);
		
		msg= msg.concat("happy"); // 문자열 결합
		System.out.println(msg);
		msg = msg + "hahahaha";
		System.out.println(msg);
		String s4 = "abcdef".substring(2);
		System.out.println(s4);
		String s5 = "abcdefghi".substring(2,5);
		System.out.println(s5);
	}
}
