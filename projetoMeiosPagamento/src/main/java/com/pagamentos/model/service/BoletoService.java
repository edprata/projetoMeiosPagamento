package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.BoletoClient;
import com.pagamentos.model.domain.Boleto;


@Service
public class BoletoService {
	
	@Autowired
	private BoletoClient boletoClient;

	public void incluir(Boleto Boleto) {
		boletoClient.incluir(Boleto);
	}
	
	public void excluir(Long id) {
		boletoClient.excluir(id);
	}
	
	public void excluirTodos() {
		boletoClient.excluirTodos();
	}
	
	public Collection<Boleto> obterLista(){
		return (Collection<Boleto>) boletoClient.listar();
	}		
}