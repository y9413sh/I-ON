package com.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// controller 역할
// spring에서 제공하는 Controller 인터페이스 구현
// JSP & Servlet Model2(MVC)

public class HelloController implements Controller { // Controller
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();

		logger.info("Welcome hello.jsp page move");

		// 1.
//		mav.addObject("name", "홍길동"); // data save
//		mav.addObject("tel", "010-1111-1111");
//		mav.addObject("age", "20");
//		mav.setViewName("/views/hello.jsp"); // move view page

		// 2.
		mav.addObject("msg", "이건 스프링 mvc");
		mav.setViewName("list"); // view 이름 설정 - /WEB-INF/jsp/ + list + .jsp

		return mav;
	}
}
