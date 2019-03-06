package com.edu.test;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener implements ServletContextListener{ //원하는 이벤트를 가지고 있는 리스너 객체를 상속
	public TestServletContextListener() {//상속한 걸 바탕으로 메소드 구현
		System.out.println("TestServletContextListener 객체 생성");
	}
	
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("ServletContext 객체 초기화");
	}
	
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Servlet 객체 해제");
	}
}
