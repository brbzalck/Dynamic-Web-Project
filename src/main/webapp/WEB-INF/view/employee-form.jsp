<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix='form' uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Empregado</title>
</head>
<body>
	<h2>Registrar Empregado</h2>
	<form:form action="processForm" modelAttribute="employee">
		<!-- Vinculando o input id ao caminho(path) id do objeto employee -->
		Id:<form:input path="id"/>
		<form:errors path="id"></form:errors>
		<br>
		Nome:<form:input path="firstName"/>
		<form:errors path="firstName"></form:errors>
		<br>
		Sobrenome:<form:input path="lastName"/>
		<br>
		Cidade:
		<form:select path="city">
			<form:options items="${employee.citiesOptions}"/>
		</form:select>
		<input type="submit" value="Enviar"/>
	</form:form>
</body>
</html>