<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Usu�rio</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">
	  <h3>Usu�rio: ${listagem.size()}</h3>
	  
	  <h4><a href="/usuario/incluir">Novo Usu�rio</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>E-mail</th>
	        <th>Senha</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="e" items="${listagem}">
		      <tr>
				<td>${e.id}</td>
		        <td>${e.nome}</td>
		        <td>${e.email}</td>
		        <td>${e.senha}</td>
		        <td><a href="/usuario/${e.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>