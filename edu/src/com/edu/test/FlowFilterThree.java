package com.edu.test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebFilter(filterName = "timer", urlPatterns = "/third") //���� �̸��� timer�� ��� urlPatterns�� Ŭ���̾�Ʈ�κ��� ��û�� /third�� �������� ����� �������� �����Ѱ���
public class FlowFilterThree implements Filter{
	public void init(FilterConfig config) {	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws java.io.IOException, ServletException{
		long startTime = System.currentTimeMillis(); //�޼ҵ尡 ����Ǵ� �ð��� �и� �� ������ ��ȯ�ϴ� �޼ҵ�
		chain.doFilter(req, res);
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		System.out.println("���� �ð� : " + executeTime + " ms");
	}
	
	public void destroy() { } 

}
