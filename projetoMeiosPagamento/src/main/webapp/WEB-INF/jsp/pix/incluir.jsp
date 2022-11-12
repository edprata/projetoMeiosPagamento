<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de PIX</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">

	<h2>PIX</h2>
	  <form action="/pix/incluir" method="post">

	    <div class="form-group">
	      <label>N�mero da Transa��o:</label>
	      <input type="text" class="form-control" placeholder="Informe o n�mero da transa��o" name="numeroTransacao">
	    </div>

	    <div class="form-group">
	      <label>Chave PIX:</label>
	      <input type="text" class="form-control" placeholder="Informe a chave PIX" name="chavePix">
	    </div>

	    <div class="form-group">
	      <label>Descri��o:</label>
	      <input type="text" class="form-control" placeholder="Informe a descri��o" name="descricao">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>