<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.err {
	color: red;
}
</style>
</head>
<body>
	<form:form method="post" modelAttribute="book" enctype="multipart/form-data">
		<table>
			<tr>
				<th>id :</th>
				<td><form:input path="id" /><br> <form:errors path="id"
						cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>name :</th>
				<td><form:input path="name" /><br> <form:errors
						path="name" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>author :</th>
				<td><form:input path="author" /><br> <form:errors
						path="author" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>nhaxb :</th>
				<td><form:input path="nhaxb" /><br> <form:errors
						path="nhaxb" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>namxb :</th>
				<td><form:input path="namxb" /><br> <form:errors
						path="namxb" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>index :</th>
				<td><form:input path="index" /><br> <form:errors
						path="index" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<th>price :</th>
				<td><form:input path="price" /><br> <form:errors
						path="price" cssClass="err"></form:errors></td>
			</tr>
				<tr>
				<th>image :</th>
				<td><form:input type="file" path="file"/><br> <form:errors
						path="price" cssClass="err"></form:errors></td>
			</tr>
		</table>
			<input type="submit" value="submit">
	</form:form>
</body>
</html>