package ex04.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML ��� PJO ����� AspectJ�� �̿��� AOP ���
public class LogAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[LOG] methodName = " + methodName + ", methodName2 = " + methodName2 + "ȣ�� �Ǳ� ��...");
		
		StopWatch sw = new StopWatch();
		sw.start();
		
		Object result = point.proceed();
		
		sw.stop();
		System.out.println("[LOG] " + methodName + "ȣ�� �Ϸ�!");
		System.out.println("[LOG] " + sw.getTotalTimeMillis()/100 + "��");
		return result;
	}
}
