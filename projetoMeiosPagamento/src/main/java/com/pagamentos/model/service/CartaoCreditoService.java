package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.CartaoCreditoClient;
import com.pagamentos.model.domain.CartaoCredito;


@Service
public class CartaoCreditoService {
	
	@Autowired
	private CartaoCreditoClient cartaoCreditoClient;

	public void incluir(CartaoCredito CartaoCredito) {
		cartaoCreditoClient.incluir(CartaoCredito);
	}
	
	public void excluir(Long id) {
		cartaoCreditoClient.excluir(id);
	}
	
	public Collection<CartaoCredito> obterLista(){
		return (Collection<CartaoCredito>) cartaoCreditoClient.listar();
	}		
}