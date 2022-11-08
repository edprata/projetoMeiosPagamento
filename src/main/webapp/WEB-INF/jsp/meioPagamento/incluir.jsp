<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Meio de Pagamento</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">

	<h2>Meio de Pagamento</h2>
	  <form action="/meioPagamento/incluir" method="post">
	    <div class="form-group">
	      <label>Valor do Pagamento:</label>
	      <input type="text" class="form-control" placeholder="Informe o valor do pagamento" name="valorPagamento">
	    </div>
	    <div class="form-group">
	      <label>Data do Pagamento:</label>
	      <input type="text" class="form-control" placeholder="Informe a data do pagamento" name="dataHoraPagamento">
	    </div>
	    <div class="form-group">
	      <label>Meio de Pagamento Ativo?:</label>
	      <input type="text" class="form-control" placeholder="Informe se estão ativo (sim/não)" name="ativo">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>