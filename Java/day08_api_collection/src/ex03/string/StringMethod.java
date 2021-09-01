package ex03.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydd";
		String s2 = "SEOUL";
		
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
		s2=s2.replace("EO", "korea");
		System.out.println(s2);
		
		s1=s1+s2;
		System.out.println(s1);
		System.out.println("------------------");
		String s3 = new String("    ab    cd    ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3=s3.trim(); // 양 옆 공백 제거, 중간은 제거 안됨
		System.out.println(s3.length());
		System.out.println("------------------");
		//String s4 = new String("ab/cd/ef/123/456/gh");
		String s4 = new String("ab cd ef 123 456 gh");
		String[] s5 = s4.split(" ");
		for(String str : s5) System.out.println(str);
		
		System.out.println("******************");
		String s6 = "adsfo12345oasdfni";
		char ch=s6.charAt(0);
		System.out.println(ch);
		
		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("소문자로 출력 toUpperCase() : "  + s2.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		for(char c : ch2) System.out.print(c);
		
	}
}
