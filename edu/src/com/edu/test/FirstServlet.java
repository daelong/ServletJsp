package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/hello2") //���� �� ����� URI
public class FirstServlet extends HttpServlet{
	
	@Override   //�̰� annotation���� @Override ������ �����ϴ� �޼ҵ�� ��ӹ��� �޼ҵ带 �������ϰڴٰ� ����ϴ� ����.(������ �˷��ִ� ����� ��.)
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() �����!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		System.out.println("service() �����!");
	}
}
