<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% request.setAttribute("contents", "<font color='red'>test</font>"); %>
	${contents}<br>
	${fn:escapeXml(contents)}
	<c:forEach begin="0" end="10" var="num" varStatus="st">
		${num} ${st.index} ${st.count}<br>
	
	
	</c:forEach>
	<%request.setAttribute("list", Arrays.asList("독서","게임","운동")); %>
	전체갯수는 : ${fn:length(list) } <br>
	<c:forEach var="hobby" items="list">
		${st.count} ${hobby} <br>
	</c:forEach>
</body>
</html>