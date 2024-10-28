<html>
<head>
</head>

<body>
	<%
	String text = request.getParameter("text");
	int count = 0;

	for (int i = 0; i < text.length(); i++) {
		char c = Character.toLowerCase(text.charAt(i));
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			count++;
		}
	}
	%>
	<p>
		Textul "<%=text%>" are <%=count%> vocale
	</p>
</body>
</html>