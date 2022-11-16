package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.repository.PagamentoRepository;


@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository pagamentoRepository;

	public Pagamento incluir(Pagamento Pagamento) {
		return pagamentoRepository.save(Pagamento);
	}
	
	public void excluir(Long id) {
		pagamentoRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		pagamentoRepository.deleteAll();
	}
	
	public Collection<Pagamento> listar(){
		return (Collection<Pagamento>) pagamentoRepository.findAll();
	}
	
	public Collection<Pagamento> listar(Long idUsuario){
		return (Collection<Pagamento>) pagamentoRepository.listar(idUsuario);
	}		

}