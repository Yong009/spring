<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../includes/header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/register" method="post">
	<table>
	
	<tr><td>도서번호<input type="text" name="bookNo"></td></tr>
	<tr><td>도서명<input type="text" name="bookName"></td></tr>
	<tr><td>도서표지<input type="text" name="bookCoverImg"></td></tr>
	<tr><td>출판일자<input type="text" name="bookDate"></td></tr>
	<tr><td>금액<input type="number" name="bookPrice"></td></tr>
	<tr><td>출판사<input type="text" name="bookPublisher"></td></tr>
	<tr><td>도서소개<textarea name="bookInfo"></textarea></td></tr>
	
		</table>
		<button type="submit">등록</button>	
	</form>
</body>
</html>