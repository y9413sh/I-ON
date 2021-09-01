package ex03.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		
		char data[] = {'a','b','c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		System.out.println(x + ", ");

		str="korea";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		
		str="abc";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		
		str="busan";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		
		str="abc";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
	}
}
