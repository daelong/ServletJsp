package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		resp.setContentType("text/html;charset=UTF-8"); //문서타입 html로 지정, 문자셋 UTF-8로 지정
		PrintWriter out = resp.getWriter();
		out.print("<h1>좋은 하루!</h1>");
		out.close();
	}
}
