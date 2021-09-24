package kr.edu.kosta;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp {

//  @Pointcut("execution(public void get*(..))")   // public void�� ��� get�޼ҵ�
//  @Pointcut("execution(* kr.edu.kosta.*.*())")   // kr.edu.kosta ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
//  @Pointcut("execution(* kr.edu.kosta..*.*())")   // kr.edu.kosta ��Ű�� & kr.edu.kosta ���� ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
//  @Pointcut("execution(* kr.edu.kosta.Worker.*())")   // kr.edu.kosta.Worker ���� ��� �޼ҵ�

//  @Pointcut("within(kr.edu.kosta.*)")   //kr.edu.kosta ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
//  @Pointcut("within(kr.edu.kosta..*)")  //kr.edu.kosta ��Ű�� �� ���� ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
//  @Pointcut("within(kr.edu.kosta.Worker)") //kr.edu.kosta.Worker ��� �޼ҵ�

	@Pointcut("bean(student)")   //student �󿡸� ����
//	@Pointcut("bean(*ker)") // ~ker�� ������ �󿡸� ����
	private void pointCutMethod() {
	}

	@Around("pointCutMethod()")
	public Object loggerApp(ProceedingJoinPoint point) throws Throwable {

		String signatureStr = point.getSignature().toLongString();
		System.out.println(signatureStr + "annotation is start....");
		long st = System.currentTimeMillis();

		try {
			Object obj = point.proceed();
			return obj;
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished.");
			System.out.println(signatureStr + "��� �ð�: " + (end - st));
		}
	}

	@Before("pointCutMethod")
	public void beforeAdvice() {
		System.out.println("beforeAdvice() ");
		System.out.println("���а� �Ի縦 �����մϴ�.");
	}
}
