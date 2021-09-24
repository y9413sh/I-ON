package ex05.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {

	public Object around(ProceedingJoinPoint point) throws Throwable {

		System.out.println("before point.proceed()");

		Object result = point.proceed();

		System.out.println("after point.proceed()");

		return result;
	}
}
