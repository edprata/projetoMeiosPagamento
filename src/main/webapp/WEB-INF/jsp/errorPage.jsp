<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Página de Erro</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container mt-3">
	  <h3>${errorMessage}</h3>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>