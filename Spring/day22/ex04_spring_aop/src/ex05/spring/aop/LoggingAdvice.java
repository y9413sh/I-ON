package ex05.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		String str1 = "���� ���� ���� ���� ȣ��˴ϴ�.";
		String str2 = "���� �Ŀ� ȣ��˴ϴ�.";
		
		System.out.println(str1);
		
		Object obj = point.proceed();
		
		System.out.println(str2);
		
		return obj;
	}
}
