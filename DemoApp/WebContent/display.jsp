<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%-- out tag'ını kullanabilmemiz için bunu eklememiz gerekiyor --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <%--DemoServlet'deki label'in değerini yazar. (Expression Language) --%>	
	${label}<br>

	
	<c:out value="${label}" />

</body>
</html>