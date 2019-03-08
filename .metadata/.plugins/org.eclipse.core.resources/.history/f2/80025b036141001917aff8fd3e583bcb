<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>application</title>
</head>
<body>
서버명 : <%= application.getServerInfo() //현재 사용하고있는 서버의 정보를 추출 %><br>
서블릿 버전 : <%= application.getMajorVersion() %>.<%= application.getMinorVersion()%>
<h3>/edu 리스트</h3>
<%
	java.util.Set<String> list = application.getResourcePaths("/"); //인자로 지정한 디렉터리의 목록을 반환
	if(list != null){ //반환값이 있으면 실행되는 부분
		Object[] obj = list.toArray(); //list객체를 배열로 반환
		for(int i = 0; i < obj.length; i++){ //배열의 값을 출력
			out.print(obj[i] + "<br>");
		}
	}
%>
</body>
</html>