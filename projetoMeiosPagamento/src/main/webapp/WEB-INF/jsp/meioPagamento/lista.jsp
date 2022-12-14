<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Meios de Pagamento</title>
</head>
<body>

	<jsp:include page="../header.jsp"></jsp:include>
	
	<div class="container mt-3">
	  <h3>Meios de Pagamento: ${listagem.size()}</h3>
	  
	  <h4><a href="/meioPagamento/incluir">Novo Meio de Pagamento</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Valor</th>
	        <th>Data</th>
	        <th>Ativo?</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="e" items="${listagem}">
		      <tr>
				<td>${e.id}</td>
		        <td>${e.valorPagamento}</td>
		        <td><fmt:parseDate value="${e.dataHoraPagamento}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both"/><fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${parsedDateTime}"/></td>
		        <td>${e.ativo}</td>
		        <td><a href="/meioPagamento/${e.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>