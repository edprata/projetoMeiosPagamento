package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.repository.MeioPagamentoRepository;


@Service
public class MeioPagamentoService {
	
	@Autowired
	private MeioPagamentoRepository meioPagamentoRepository;

	public MeioPagamento incluir(MeioPagamento meioPagamento) {
		return meioPagamentoRepository.save(meioPagamento);
	}
	
	public void excluir(Long id) {
		meioPagamentoRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		meioPagamentoRepository.deleteAll();
	}
	
	public Collection<MeioPagamento> listar(){
		return (Collection<MeioPagamento>) meioPagamentoRepository.findAll();
	}		

	public Collection<MeioPagamento> listar(Long idUsuario){
		return (Collection<MeioPagamento>) meioPagamentoRepository.listar(idUsuario);
	}

}