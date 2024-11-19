<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Single song page</h1>
	
	<h3>Id -- <c:out value="${s.id}"/></h3>
	<h3>name -- <c:out value="${s.name}"/></h3>
	<h3>price -- <c:out value="${s.price}"/></h3>
	<h3>cod -- <c:out value="${s.cod}"/></h3>
	
</body>