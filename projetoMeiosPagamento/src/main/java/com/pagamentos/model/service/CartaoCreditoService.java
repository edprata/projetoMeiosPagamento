package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.CartaoCredito;
import com.pagamentos.model.repository.CartaoCreditoRepository;


@Service
public class CartaoCreditoService {
	
	@Autowired
	private CartaoCreditoRepository CartaoCreditoRepository;

	public void incluir(CartaoCredito CartaoCredito) {
		CartaoCreditoRepository.save(CartaoCredito);
	}
	
	public void excluir(Long id) {
		CartaoCreditoRepository.deleteById(id);
	}
	
	public Collection<CartaoCredito> obterLista(){
		return (Collection<CartaoCredito>) CartaoCreditoRepository.findAll();
	}		
}