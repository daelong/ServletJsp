package com.edu.test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebFilter(filterName = "timer", urlPatterns = "/third") //필터 이름을 timer로 등록 urlPatterns는 클라이언트로부터 요청이 /third로 들어왔을때 실행될 필터임을 설정한것임
public class FlowFilterThree implements Filter{
	public void init(FilterConfig config) {	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws java.io.IOException, ServletException{
		long startTime = System.currentTimeMillis(); //메소드가 실행되는 시간을 밀리 초 단위로 반환하는 메소드
		chain.doFilter(req, res);
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		System.out.println("수행 시간 : " + executeTime + " ms");
	}
	
	public void destroy() { } 

}
