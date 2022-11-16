package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.MeioPagamentoClient;
import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.domain.Usuario;


@Service
public class MeioPagamentoService {
	
	@Autowired
	private MeioPagamentoClient meioPagamentoClient;

	public void incluir(MeioPagamento MeioPagamento) {
		meioPagamentoClient.incluir(MeioPagamento);
	}
	
	public void excluir(Long id) {
		meioPagamentoClient.excluir(id);
	}
	
	public Collection<MeioPagamento> obterLista(){
		return (Collection<MeioPagamento>) meioPagamentoClient.listar();
	}		

	public Collection<MeioPagamento> obterLista(Usuario usuario){
		return (Collection<MeioPagamento>) meioPagamentoClient.listar(usuario.getId());
	}

}