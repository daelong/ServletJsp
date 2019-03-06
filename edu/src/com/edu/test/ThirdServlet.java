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
		int i = 1;
		while(i <= 10) {
			out.print("<br>number : " + i);
			i++;
			
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		out.print("<br>실행완료");
		out.close();
	}
}
