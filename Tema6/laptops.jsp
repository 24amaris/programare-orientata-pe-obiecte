<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laptops</title>
</head>
<body>
 	<p><c:out value="${brand}" />, <c:out value="${length}" /> caractere</p>
    <p><c:out value="${brand}" />, <c:out value="${parity}" /></p>

</body>
</html>