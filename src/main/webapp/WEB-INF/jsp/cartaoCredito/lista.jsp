<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Cartão de Crédito</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>
	
	<div class="container mt-3">
	  <h3>Cartões de Crédito: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Número</th>
	        <th>Titular</th>
	        <th>Validade</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="e" items="${listagem}">
		      <tr>
				<td>${e.id}</td>
		        <td>${e.numeroCartao}</td>
		        <td>${e.nomeTitular}</td>
		        <td>${e.validade}</td>
		        <td><a href="/cartaoCredito/${e.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>