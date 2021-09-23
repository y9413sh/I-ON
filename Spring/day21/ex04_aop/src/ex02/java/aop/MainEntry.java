package ex02.java.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new CalcImpl();
		
		Calc proxy = (Calc) Proxy.newProxyInstance(
							c.getClass().getClassLoader(), // loader : Ŭ���� ã��
							c.getClass().getInterfaces(), // interfaces : ����(�Լ�)
							new LogPrintHandlerImpl(c)); // handelr : �������� ����
		
		//Ŭ���� ���ؼ� ����
		System.out.println(c.add(1, 2));
		System.out.println(c.mul(10, 2));
		
		//Proxy�� ����
		System.out.println(proxy.add(3, 5));
		System.out.println(proxy.add(3, 4));
		
	}
}
