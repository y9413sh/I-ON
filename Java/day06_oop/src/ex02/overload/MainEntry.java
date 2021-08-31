package ex02.overload;
// overload method
public class MainEntry {
	
	public static void line(int n, String str) {  // 정의부 
		for (int i = 1; i <= n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		line(20, "#");
		line("A");
		line();  // 호출
		line("*");
	}
	
	public static void line(String str) {
		for (int i = 1; i < 10; i++) {
			System.out.print(str);
		}	
		System.out.println();
	}

	public static void line() {  // 정의부 
		System.out.println("==================");
	}
}
