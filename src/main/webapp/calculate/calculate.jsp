<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 7/25/2024
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="/calculate-servlet" method="post">
	<label for="">First Number</label>
	<input type="text" name="firstNumber"/>
	<label for="">Operator</label>
	<select name="operator" id="">
		<option value="plus">plus</option>
		<option value="minus">minus</option>
		<option value="multi">multi</option>
		<option value="divide">divide</option>
	</select>
	<label for="">Second Number</label>
	<input type="text" name="secondNumber">
	<button type="submit">CALCULATE</button>
</form>
</body>
</html>
