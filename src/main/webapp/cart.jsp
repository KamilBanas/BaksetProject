<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Your CART
	<table>
		<thead>
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${items}" var="item">
				<tr>
				
					<td>${item.name}</td>
					<td>${item.price}</td>
				
					<td><a href="Remove?id=${item.id}">Remove</a></td>
				</tr>
			</c:forEach>
				
			<tr>
				<td></td>
				<td>${order.totalPrice}</td>
		</tbody>
	</table>
	<a href="Checkout?id=${item.id}">Checkout</a>
	<a href="Checkout?id=${item.id}" onclick="history.go(-1); return false;">Continue Shopping</a>

</body>
</html>