<%@page import="java.util.List"%>
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
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	%>
	<h1>
		name is
		<%=name%></h1>

	<h1>
		id is
		<%=id%></h1>



</body>
</html>