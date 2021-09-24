package ex04.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML 기반 PJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[LOG] methodName = " + methodName + ", methodName2 = " + methodName2 + "호출 되기 전...");
		
		StopWatch sw = new StopWatch();
		sw.start();
		
		Object result = point.proceed();
		
		sw.stop();
		System.out.println("[LOG] " + methodName + "호출 완료!");
		System.out.println("[LOG] " + sw.getTotalTimeMillis()/100 + "초");
		return result;
	}
}
