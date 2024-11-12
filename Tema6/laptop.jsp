<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laptop</title>
</head>
<body>
	<h2>Informații despre Laptop</h2>
	<p>
		Brand:
		<c:out value="${lap.brand}" />
	</p>
	<p>
		Preț:
		<c:out value="${lap.pret}" />
		RON
	</p>
	<p>
		RAM:
		<c:out value="${lap.ram}" />
		GB
	</p>
</body>
</html>