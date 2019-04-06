<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%-- out tag'ını kullanabilmemiz için bunu eklememiz gerekiyor --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head> 
<body>	
	
	<c:set var="str" value="Onur SAZAK is a software developer"></c:set>
	
	Length : ${fn:length(str)}
	<br>
	
	<c:forEach items="${fn:split(str,' ')}" var="s" > 
	<br>
	${s}
	</c:forEach>
	<br>  
	<br>
	
	index : ${fn:indexOf(str,"is")}
	<br>
	
	is there : ${fn:contains(str,"software")}
	<br>
	
	<c:if test="${fn:contains(str,'software')}">
		software is there
	</c:if>
	<br>
	
	${fn:toLowerCase(str)}

</body>
</html>