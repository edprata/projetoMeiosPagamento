package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.CartaoCredito;
import com.pagamentos.model.repository.CartaoCreditoRepository;


@Service
public class CartaoCreditoService {
	
	@Autowired
	private CartaoCreditoRepository cartaoCreditoRepository;

	public CartaoCredito incluir(CartaoCredito CartaoCredito) {
		return cartaoCreditoRepository.save(CartaoCredito);
	}
	
	public void excluir(Long id) {
		cartaoCreditoRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		cartaoCreditoRepository.deleteAll();
	}
	
	public Collection<CartaoCredito> listar(){
		return (Collection<CartaoCredito>) cartaoCreditoRepository.findAll();
	}		
}