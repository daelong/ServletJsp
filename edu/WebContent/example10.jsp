<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Result</title>
</head>
<body>
<% if(request.getMethod().equals("POST")){ %>
	<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(id.isEmpty() || pwd.isEmpty()){
		request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요!"); // 메시지 전달
		RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");// RequestDispatcher메소드는 forward, include 메소드를 가지고 있는 객체이다. ""에 설정한 파일의 요청을 rd로 넣고
		rd.forward(request, response); //rd발생시 forward하게끔 지정한다. 
		return;
	}
	//로그인 처리
	if(session.isNew() || session.getAttribute("id") == null){ //session은 HttpSession 타입의 내장 객체임. 로그인 상태는 현재 HttpSession객체가 존재하고, HttpSession객체 안에 "id"이름으로 데이터가 등록되어 있는 상태
		session.setAttribute("id", id); //위에 두가지 식 둘다 충족되어야 이제 로그인작업이 완료되는것
		out.print("로그인 작업이 완료되었습니다.");
	} else { 
		out.print("이미 로그인 상태입니다."); //두조건 모두 만족하지 못할 시 로그인 상태인 것
	}
	%>
	<%= id %> / <%= pwd %>
	
	<% }else if(request.getMethod().equals("GET")){
			if(session != null && session.getAttribute("id") != null){ //세션이 null인지 아닌지를 판단함. 즉, 현재 HttpSession 객체가 존재하는지 물어보는 것, session.getAttribute("id") != null은 session에서 id값을 추출한 후 그 값이 null이 아닌지 물어봄 null을 반환하면 "id"이름으로 등록된 데이터가 없다는 의미 두가지 모두 성립될 때 로그인상태인 것임
				session.invalidate(); // HttpSession객체를 삭제하는 메소드 -> 로그아웃하는것 
				out.print("로그아웃 작업이 완료되었습니다.");
			}else{
				out.print("현재 로그인 상태가 아닙니다.");
			}
	}
	%>
	<%
		RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
		rd.forward(request, response);
	%>
</body>
</html>