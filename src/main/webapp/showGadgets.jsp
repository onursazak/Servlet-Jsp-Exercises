<%@page import="com.onur.web.model.Gadgets"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor ="cyan">
		
	
	<%
		Gadgets g1 = (Gadgets) request.getAttribute("gadget");
		out.println(g1);
	%>
	
	
</body>
</html>