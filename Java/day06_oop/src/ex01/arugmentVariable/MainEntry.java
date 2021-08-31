package ex01.arugmentVariable;

// 가변길이 
public class MainEntry {

	public static void main(String[] args) {
		plus1(1,2);
		plus1(3);
		plus1(10,22,3,4,5,6,7,9);
		
		plus("A", " kbs");
		plus("33", " kbs", "mbc" , " sbs");
		
		int hap = plus1(1,2,3);
		System.out.println("return type : " + hap);
		System.out.println(plus1(10,20,30,40,50));
		System.out.println("string return type : ");
		System.out.println(plus2("a", "b", "c"));	
	}

	// return type 형태로도 구현
	private static String plus2(String...x) {
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i] + " ";
		}
		return sum;
		
	}

	
	private static int plus1(int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		return sum;
	}
	
	
	private static void plus(String...x) {
		String sum = "";
		for (int i = 0; i < x.length; i++) {
//			System.out.print(str[i] + " ");
			sum += x[i] + " ";
		}
		System.out.println("String sum = " + sum);
		
	}

	public static void plus(int...x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
//			System.out.print(sum + " ");
		}
		System.out.println("sum = " + sum);
	}
}
