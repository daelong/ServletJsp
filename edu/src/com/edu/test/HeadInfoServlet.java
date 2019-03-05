package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/headerInfo")
public class HeadInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) { //em이 가리키는 enumeration객체의 커서 다음에 데이터가 있는지 없는지를 판단하고 있으면 true, 없으면 false를 반환한다.
			String s = em.nextElement(); // em의 커서 다음에 있는 요소를 반환하고 커서를 다음 요소로 이동시킨다.
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

}
