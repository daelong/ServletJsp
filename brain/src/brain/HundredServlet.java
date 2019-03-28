package brain;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HundredServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int total = 0;
		for(int i = 0; i < 101; i++) {
			total += i;
		}
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>1부터 100까지의 합</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("1 + 2 + 3 + ........ + 100", total);
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
