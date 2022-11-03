package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.repository.PagamentoRepository;


@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository PagamentoRepository;

	public void incluir(Pagamento Pagamento) {
		PagamentoRepository.save(Pagamento);
	}
	
	public void excluir(Long id) {
		PagamentoRepository.deleteById(id);
	}
	
	public Collection<Pagamento> obterLista(){
		return (Collection<Pagamento>) PagamentoRepository.findAll();
	}		
}