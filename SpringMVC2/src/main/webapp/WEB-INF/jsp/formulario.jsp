<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="agregar.html" method="POST" commandName="cmdForm">

		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre" />

		<form:label path="apellido">Apellido</form:label>
		<form:input path="apellido" />
		
		<input type="submit" value="Saludar" />

	</form:form>

</body>
</html>