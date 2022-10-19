<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>id :</th>
			<td>${book.id }</td>
		</tr>
		<tr>
			<th>name :</th>
			<td>${book.name }</td>
		</tr>
		<tr>
			<th>author :</th>
			<td>${book.author }</td>
		</tr>
		<tr>
			<th>nha xb :</th>
			<td>${book.nhaxb }</td>
		</tr>
		<tr>
			<th>nam xb :</th>
			<td>${book.namxb }</td>
		</tr>
		<tr>
			<th>index :</th>
			<td>${book.index }</td>
		</tr>
		<tr>
			<th>price :</th>
			<td>${book.price }</td>
		</tr>
		<tr>
			<th>Image :</th>
			<td><img src='<c:url value="/resources/images/"/>${book.file}' width="50px"></td>
		</tr>
	</table>
</body>
</html>