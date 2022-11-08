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
	  <h3>Pagamentos: ${listagem.size()}</h3>
	  
	  <h4><a href="/pagamento/incluir">Novo Pagamento</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Número Transação</th>
	        <th>Data</th>
	        <th>Total</th>
	        <th>Cliente</th>
	        <th>Meios de Pagamento</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="e" items="${listagem}">
		      <tr>
				<td>${e.id}</td>
		        <td>${e.numeroTransacao}</td>
		        <td>${e.dataHoraTransacao}</td>
		        <td>${e.valorTotal}</td>
		        <td>${e.cliente.nome}</td>
		        <td>${e.meiosPagamento.size()}</td>
		        <td><a href="/pagamento/${e.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>