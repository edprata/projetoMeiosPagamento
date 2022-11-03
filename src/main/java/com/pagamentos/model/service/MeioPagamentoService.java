package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.repository.MeioPagamentoRepository;


@Service
public class MeioPagamentoService {
	
	@Autowired
	private MeioPagamentoRepository MeioPagamentoRepository;

	public void incluir(MeioPagamento MeioPagamento) {
		MeioPagamentoRepository.save(MeioPagamento);
	}
	
	public void excluir(Long id) {
		MeioPagamentoRepository.deleteById(id);
	}
	
	public Collection<MeioPagamento> obterLista(){
		return (Collection<MeioPagamento>) MeioPagamentoRepository.findAll();
	}		
}