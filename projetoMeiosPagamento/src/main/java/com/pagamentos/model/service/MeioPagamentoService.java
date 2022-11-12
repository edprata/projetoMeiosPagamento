package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.repository.MeioPagamentoRepository;


@Service
public class MeioPagamentoService {
	
	@Autowired
	private MeioPagamentoRepository meioPagamentoRepository;

	public void incluir(MeioPagamento MeioPagamento) {
		meioPagamentoRepository.save(MeioPagamento);
	}
	
	public void excluir(Long id) {
		meioPagamentoRepository.deleteById(id);
	}
	
	public Collection<MeioPagamento> obterLista(){
		return (Collection<MeioPagamento>) meioPagamentoRepository.findAll();
	}		

	public Collection<MeioPagamento> obterLista(Usuario usuario){
		return (Collection<MeioPagamento>) meioPagamentoRepository.listar(usuario.getId());
	}

}