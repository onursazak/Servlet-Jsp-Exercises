<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

	<%
		String name = request.getAttribute("label1").toString();
		out.println(name);
	%>
	
	 <%--DemoServlet'deki label'in değerini yazar. --%>	
	${label1} 	

</body>
</html>