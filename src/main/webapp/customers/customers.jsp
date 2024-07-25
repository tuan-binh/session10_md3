<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 7/25/2024
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>

<table>
	<thead>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>ADDRESS</th>
		<th>DATE</th>
		<th>IMAGE</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${customers}" var="c">
		<tr>
			<td>${c.id}</td>
			<td>${c.name}</td>
			<td>${c.address}</td>
			<td><fmt:formatDate value="${c.dob}" pattern="dd/MM/yyyy"/></td>
			<td>
				<img src="${c.image}" alt="img" style="height: 100px;width: 100px;object-fit: cover">
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>
