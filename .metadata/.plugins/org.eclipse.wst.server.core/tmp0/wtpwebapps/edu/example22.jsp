<%@ pagecontentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>example</title>
</head>
<body>
	<jsp:useBean id="book" class="com.edu.beans.BookBean" />
	<jsp:setProperty property="*" name="book" />
	
	<%
		application.setAttribute("book", book);
	%>
	
	<jsp:forward page="bookOutput.jsp" />
</body>
</html>