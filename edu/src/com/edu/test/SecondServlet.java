package com.edu.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("SecondServlet!!"); //이건 출력되지 않음 
		PrintWriter out = resp.getWriter(); //resp.getWriter()의 값을 printWriter형식의 out 받아줘야 출력을 할 수 있음.
		out.print("<html><head><title>Test</title></head>"); //out으로 받ㅇ
		out.print("<body><h1>have a nice day!!</h1></body>");
		out.print("</html>");
		out.close();
	}
}
