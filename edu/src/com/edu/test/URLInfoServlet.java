package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		res.setContentType("text/html;charse=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>eEquest 정보 출력 Servlet(/title></head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("REquest URI : " + req.getRequestURI() + "<br/>");
		out.print("REquest URL : " + req.getRequestURL() + "<br/>");
		out.print("context Path : " + req.getContextPath() + "<br/>");
		out.print("REquest Protocol : " + req.getProtocol() + "<br/>");
		out.print("Servlet path : " + req.getServletPath() + "<br/>");
		out.print("</body></html>");
		out.close();
	}

}
