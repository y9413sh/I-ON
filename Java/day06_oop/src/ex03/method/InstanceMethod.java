package ex03.method;
/*
 * instance method : ��ü �����ϰ� ����ؾ��� (�޸𸮻� �Ҵ��� �Ǿ��...)
    ��) Scanner sc = new Scanner(System.in);
           sc.nextInt(), sc.nextFloat(), sc.nextLine(),....
 */
class B {
	int x, y;
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
} // B class end

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); //��ü����, �޸𸮿��Ҵ�, �������Լ� �ڵ�ȣ��
		
		b.setData(20, 50);
	}
}
