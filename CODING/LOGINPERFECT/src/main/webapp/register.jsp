<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
	<form action="userServlet" method="post">

		<label for="name">Name:</label> 
		<input type="text" name="name">

		<label for="address">Email:</label> 
		<input type="text" name="email">

		<label for="password">Password:</label> 
		<input type="text" name="password" >

		<input type="submit" value="Submit">
	</form>
</body>
</html>