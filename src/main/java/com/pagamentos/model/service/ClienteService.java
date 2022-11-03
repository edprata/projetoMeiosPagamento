package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository ClienteRepository;

	public void incluir(Cliente Cliente) {
		ClienteRepository.save(Cliente);
	}
	
	public void excluir(Long id) {
		ClienteRepository.deleteById(id);
	}
	
	public Collection<Cliente> obterLista(){
		return (Collection<Cliente>) ClienteRepository.findAll();
	}		
}