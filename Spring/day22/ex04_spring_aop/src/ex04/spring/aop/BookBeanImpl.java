package ex04.spring.aop;

public class BookBeanImpl implements BookBean {

	@Override
	public void testHello(String str) {
		System.out.println("public void testHello(String str) ȣ���");

	}

	@Override
	public int korHello() {
		System.out.println("public int korHello() ȣ���");
		return 100;
	}

}
