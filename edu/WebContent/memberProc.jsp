<%@ page import="com.edu.biz.MemberService" %>
<%@ page contentType="text/html;charset=MS949" errorPage="error.jsp"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="com.edu.beans.Member" id="member"/>
<jsp:setProperty property="*" name="member"/>

<% 
	MemberService service = new MemberService();
	service.memberInsert(member);
	
	RequestDispatcher rd = request.getRequestDispatcher("memberOutput.jsp");
	rd.forward(request, response);
%>