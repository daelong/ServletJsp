package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookie2")
public class CookieTest2Servlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		Cookie[] list = req.getCookies(); //클라이언트로 전송된 쿠키를 서버에서 읽어들인다
		for(int i = 0; list!=null && i < list.length; i++) { //쿠키가 있을때  리스트의 길이만큼 반복
			out.println(list[i].getName() + ":" + list[i].getValue() + "<br>"); //list의 이름과 값 출력
		}
		
		out.close();
	}

}
