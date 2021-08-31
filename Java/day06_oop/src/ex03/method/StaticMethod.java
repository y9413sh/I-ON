package ex03.method;
/*
 * static method : 객체 생성 없이 바로 사용 가능함
    호출방법> objectName.methodName();
	     className.methodName();  // 
 */
class A {
	int x, y;
	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
} // A class end


public class StaticMethod {
	public static void main(String[] args) {
		A.setData(10, 20);  // className.methodName();
		
		A a = new A(); //객체생성, 메모리에할당, 생성자함수 자동호출
		a.x = 99; // X
		a.setData(1, 2);  // objectName.methodName()
		A.setData(3, 4);
	}

}
