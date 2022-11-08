<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Boleto</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">

	<h2>Boleto</h2>
	  <form action="/boleto/incluir" method="post">
	    <div class="form-group">
	      <label>Número do Boleto:</label>
	      <input type="text" class="form-control" placeholder="Número do Boleto" name="numeroBoleto">
	    </div>
	    <div class="form-group">
	      <label>Banco:</label>
	      <input type="text" class="form-control" placeholder="Número do Banco" name="numeroBanco">
	    </div>
	    <div class="form-group">
	      <label>Agência:</label>
	      <input type="text" class="form-control" placeholder="Número da Agência" name="numeroAgencia">
	    </div>
	    <div class="form-group">
	      <label>Conta:</label>
	      <input type="text" class="form-control" placeholder="Número da Conta" name="numeroConta">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>