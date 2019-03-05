package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/hello2") //접근 시 사용할 URI
public class FirstServlet extends HttpServlet{
	
	@Override   //이건 annotation으로 @Override 다음에 선언하는 메소드는 상속받은 메소드를 재정의하겠다고 명시하는 것임.(정보를 알려주는 기능을 함.)
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() 실행됨!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		System.out.println("service() 실행됨!");
	}
}
