<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 7/25/2024
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>PRODUCT</title>
</head>
<body>
<form action="/product-servlet" method="post" enctype="multipart/form-data">
	<div>
		<label for="name">NAME</label> <br>
		<input type="text" name="name" id="name" placeholder="name">
	</div>
	<div>
		<label for="image">IMAGE</label> <br>
		<input type="file" name="image" id="image">
	</div>
	<div>
		<label for="price">PRICE</label> <br>
		<input type="text" name="price" id="price">
	</div>
	<div>
		<label for="stock">STOCK</label> <br>
		<input type="text" name="stock" id="stock">
	</div>
	<button type="submit">ADD</button>
</form>
</body>
</html>
