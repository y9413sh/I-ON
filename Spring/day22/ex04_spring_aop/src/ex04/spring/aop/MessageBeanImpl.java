package ex04.spring.aop;

public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		System.out.println("public int sayHello() ȣ���");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void engHello() {
		System.out.println("public int engHello() ȣ���");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
