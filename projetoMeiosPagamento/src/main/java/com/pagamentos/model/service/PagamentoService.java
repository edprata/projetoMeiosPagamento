package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.PagamentoClient;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.domain.Usuario;


@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoClient pagamentoClient;

	public void incluir(Pagamento Pagamento) {
		pagamentoClient.incluir(Pagamento);
	}
	
	public void excluir(Long id) {
		pagamentoClient.excluir(id);
	}

	public Collection<Pagamento> listar(){
		return (Collection<Pagamento>) pagamentoClient.listar();
	}
	
	public Collection<Pagamento> listar(Usuario usuario){
		return (Collection<Pagamento>) pagamentoClient.listar(usuario.getId());
	}		

}