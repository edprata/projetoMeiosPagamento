<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Cliente</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">

	<h2>Cliente</h2>
	  <form action="/cliente/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email">
	    </div>

	    <div class="form-group">
	      <label>Documento:</label>
	      <input type="text" class="form-control" placeholder="Entre com seu Documento" name="numeroDocumento">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>