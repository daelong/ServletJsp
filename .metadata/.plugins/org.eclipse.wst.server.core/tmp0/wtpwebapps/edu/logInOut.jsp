<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Input</title>
</head>
<body>
	<% if(session.isNew() || session.getAttribute("id") == null){ //로그아웃 상태일때만 표시%>
	<%
		String msg = (String)request.getAttribute("error"); //이 실행문은 HttpServletRequest객체에 "error"란 이름으로 등록된 값을 추출하여 반환한다. 이때 반환된 값의 타입이 Object이므로 원래 등록했던 타입인 String타입으로 변경한다
		if(msg == null) msg = ""; //처음 logInOut.jsp를 실행했을때 error가 뜨지 않게 하기위해 설정하는 것
	%>
		<%= msg %> <%--msg출력 --%>
	<form action = "example10.jsp" method = "post">
		ID : <input type = "text" name= "id"><br>
		비밀번호 : <input type = "password" name = "pwd"><br>
		<input type = "submit" value = "로그인">
	</form>
	<%}else{ //로그인 상태일때만 표시%>
	<a href = "example10.jsp">로그아웃</a>
	<%} %>
</body>
</html>