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
<%Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer age = (Integer) request.getAttribute("age");
	List<String> friends = (List<String>) request.getAttribute("f");%>
	
	<h1>name is<%=name%></h1>

	<h1>id is<%=id%></h1>

	<h1>age is<%=age%></h1>

	<%for (String s : friends) {%><h1>friends are the<%=s%></h1>
	<%}%>

</body>
</html>