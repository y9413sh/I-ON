package ex03.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invoke method start~~~~");
		
		//���� ���� ����
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[Ÿ�̸� ����]");
		
		// �ְ��� ���� �ڵ�
		///////////////////////////////////
		Object result = invocation.proceed();
		///////////////////////////////////
		
		
		log.info("[Ÿ�̸� ����]");
		sw.stop();
		log.info("TIME LOG] method : " + invocation.getMethod());
		log.info("TIME LOG] process timie : " + sw.getTotalTimeMillis());		
		
		return result;
	}

}
