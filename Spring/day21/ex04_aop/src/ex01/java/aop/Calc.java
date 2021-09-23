package ex01.java.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	
	public int add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");		
		int result = x + y; 
		
		sw.stop();
		log.info("[타이머 정지]");
		log.info("TIME LOG] method : add");
		log.info("TIME LOG] process timie : " + sw.getTotalTimeMillis());		
		
		return result;
	}
	
	public int mul(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		int result = x * y; 
		
		sw.stop();
		log.info("[타이머 정지]");
		log.info("TIME LOG] method : add");
		log.info("TIME LOG] process timie : " + sw.getTotalTimeMillis());
		
		return result;
	}
}
