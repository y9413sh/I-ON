package ex03.method;
/*
 * static method : ��ü ���� ���� �ٷ� ��� ������
    ȣ����> objectName.methodName();
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
		
		A a = new A(); //��ü����, �޸𸮿��Ҵ�, �������Լ� �ڵ�ȣ��
		a.x = 99; // X
		a.setData(1, 2);  // objectName.methodName()
		A.setData(3, 4);
	}

}
