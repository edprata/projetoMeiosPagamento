package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente incluir(Cliente Cliente) {
		return clienteRepository.save(Cliente);
	}
	
	public void excluir(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		clienteRepository.deleteAll();
	}
	
	public Cliente findByEmail(String email) {
		return clienteRepository.findByEmail(email);
	}
	
	public Collection<Cliente> listar(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}		

	public Collection<Cliente> listar(Long idUsuario){
		return (Collection<Cliente>) clienteRepository.listar(idUsuario);
	}		

}