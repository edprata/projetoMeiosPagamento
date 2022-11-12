package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void incluir(Cliente Cliente) {
		clienteRepository.save(Cliente);
	}
	
	public void excluir(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public Cliente findByEmail(String email) {
		return clienteRepository.findByEmail(email);
	}
	
	public Collection<Cliente> listar(){
		return (Collection<Cliente>) clienteRepository.findAll();
	}		

	public Collection<Cliente> listar(Usuario usuario){
		return (Collection<Cliente>) clienteRepository.listar(usuario.getId());
	}		

}