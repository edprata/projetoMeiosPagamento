<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Usuário</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<form action="/cep" class="form-inline" method="post">

	    <div class="form-group">
	      <label>CEP:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu CEP" name="cep">
	    </div>

	    <button type="submit" class="btn btn-default">Buscar</button>
	</form>

	  <h2>Usuário</h2>
	  <form action="/usuario/incluir" method="post">
	  
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>
	  
	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>
	  
	    <div class="form-group">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>
	    
	    <c:import url="/WEB-INF/jsp/usuario/endereco.jsp"/>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>