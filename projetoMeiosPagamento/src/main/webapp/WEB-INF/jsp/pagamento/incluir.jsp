<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Pagamento</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>

	<div class="container mt-3">

	<h2>Pagamento</h2>
	  <form action="/pagamento/incluir" method="post">
	    
	    <div class="form-group">
	      <label>Número da Transação:</label>
	      <input type="text" class="form-control" placeholder="Informe o número da transação" name="numeroTransacao">
	    </div>
	    
	    <div class="form-group">
	      <label>Data da Transação:</label>
	      <input type="datetime-local" class="form-control" name="dataHoraTransacao">
	    </div>
	    
	    <div class="form-group">
	      <label>Valor total:</label>
	      <input type="text" class="form-control" placeholder="Informe o valor total" name="valorTotal">
	    </div>

	    <div class="form-group">
	      <label>Cliente:</label>
	      <select name="cliente" class="form-control">
	      	<c:forEach var="e" items="${clientes}">
	      		<option value="${e.id}">${e.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Meios de Pagamento:</label>
	      	<c:forEach var="e" items="${meiosPagamento}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="meiosPagamento" value="${e.id}">
				  <label class="form-check-label"> ${e.nome}</label>
				</div>	   
			</c:forEach>
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>