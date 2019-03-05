package com.edu.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("SecondServlet!!"); //�̰� ��µ��� ���� 
		PrintWriter out = resp.getWriter(); //resp.getWriter()�� ���� printWriter������ out �޾���� ����� �� �� ����.
		out.print("<html><head><title>Test</title></head>"); //out���� �ޤ�
		out.print("<body><h1>have a nice day!!</h1></body>");
		out.print("</html>");
		out.close();
	}
}
