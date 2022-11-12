<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">AppMeiosPgto</a>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuário</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/pagamento/lista">Pagamento</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="/meioPagamento/lista">Meio de Pagamento</a></li>
			<li class="nav-item"><a class="nav-link" href="/pix/lista">PIX</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/boleto/lista">Boleto</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="/cartaoCredito/lista">Cartão de Crédito</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty user}">
				<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>

			<c:if test="${not empty user}">
				<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>