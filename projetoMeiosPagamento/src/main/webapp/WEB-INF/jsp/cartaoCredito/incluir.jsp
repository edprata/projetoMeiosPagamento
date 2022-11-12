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

	<h2>Cartão de Crédito</h2>
	  <form action="/boleto/incluir" method="post">

	    <div class="form-group">
	      <label>Número Cartão:</label>
	      <input type="text" class="form-control" placeholder="Número Cartão" name="numeroCartao">
	    </div>

	    <div class="form-group">
	      <label>Titular:</label>
	      <input type="text" class="form-control" placeholder="Nome do Titular" name="nomeTitular">
	    </div>

	    <div class="form-group">
	      <label>Validade:</label>
	      <input type="text" class="form-control" placeholder="Validade do cartão (MM/AA)" name="validade">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>