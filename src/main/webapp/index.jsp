<html>

	<head>
	</head>

	<body>
	<%
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		int sum = a + b;
	%>
		
		<h1>Suma</h1>
		<p>Suma este : <b><%= sum %></b></p>
		
	</body>
</html>
