<html>
<head>
</head>
<body>
	<%
	int a = Integer.parseInt(request.getParameter("a"));
	if (a % 2 == 0) {
	%>
	<p>
		Numarul par este : <b><%=a%></b>
	</p>
	<%
	} else {
	%>
	<p>
		Numarul impar este : <b><%=a%></b>
	</p>
	<%
	}
	%>
</body>
</html>
