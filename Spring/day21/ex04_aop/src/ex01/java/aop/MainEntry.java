package ex01.java.aop;

public class MainEntry {

	public static void main(String[] args) {
		Calc calc = new Calc();

		System.out.println(calc.add(1, 2));
		System.out.println(calc.mul(1, 2));
	}

}
