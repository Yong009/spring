<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

	
		<table>
			<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>성</th>
			<th>급여</th>
			<th>입사일</th>
		</tr>
		<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.employeeId}</td>
			<td>${emp.firstName}</td>
			<td>${emp.lastName}</td>
			<td>${emp.salary}</td>
			<td>${emp.hireDate}</td>
			</tr>
			</c:forEach>
		
		</table>
	
</body>
</html>