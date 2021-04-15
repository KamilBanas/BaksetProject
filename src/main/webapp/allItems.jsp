<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All items Stock</title>
</head>
<body>
	<h2>All items Stock</h2>


	<table>
		<thead>
			<tr>
				<th align="left">Name</th>
				<th align="left">Description</th>
				<th align="left">Price</th>
				<th align="left">Qty</th>
			</tr>
		<thead>
		<tbody>
			<c:forEach items="${items}" var="item">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.price}</td>
					<td>${item.quantity}</td>
				
					<td><a href="viewItem?id=${item.id}">Add quantity</a></td>
<%-- 					<td><sf:form method="post" action="AddToCart" modelAttribute="item"><input type="text"></form></td> --%>
<%-- 					<td><sf:form> --%>
					
<%--             		<sf:input type="number"/> --%>

<%-- 						</sf:form></td> --%>
					<%-- 					<td><sf:form action="AddToCart" method="post" --%>
					<%-- 					modelAttribute="items"> --%>
					<!-- 							<div> -->
					<%-- 								<sf:input type="number" min="0" path="item" required="required" /> --%>
					<!-- 							</div> -->
					<!-- 							<div> -->
					<%-- 								<sf:hidden path="id" value="${item.id}"></sf:hidden> --%>
					<%-- 								<sf:hidden path="id_second" value="${order.id}"></sf:hidden> --%>
					<!-- 							</div> -->
					<!-- 							<button type="submit">Enter</button> -->
					<%-- 						</sf:form> --%>

					<td><a href="addItemToCart?id=${item.id}"> Add to cart </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>

</body>
</html>
