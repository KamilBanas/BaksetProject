<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/navbar-static/">
<!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<sf:form id="returnSubmit" action="returnSubmit" method="post" >
<div class="card">
<div class="card-body">
<h2>Enter the date of return </h2>
<br>
<div class="form-group">
<label class="form-label" name="requestedQuantity">Quantity</label>
<input class="form-control" type="text" name="requestedQuantity" required="required"/>
</div>
<br>
<div class="form-group" style={{ padding-top: 20% }}>
<button class="btn btn-primary btn-lg" type="submit" >OK</button>
<input type="hidden" value="${id}" name="id" method="post">
</div>
</div>
</div>
</sf:form>

</body>
</html>