package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.ClienteClient;
import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.domain.Usuario;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteClient clienteClient;

	public void incluir(Cliente Cliente) {
		clienteClient.incluir(Cliente);
	}
	
	public void excluir(Long id) {
		clienteClient.excluir(id);
	}
	
	public Cliente findByEmail(String email) {
		return clienteClient.listar(email);
	}
	
	public Collection<Cliente> listar(Long idUsuario){
		return (Collection<Cliente>) clienteClient.listar(idUsuario);
	}		

	public Collection<Cliente> listar(Usuario usuario){
		return (Collection<Cliente>) clienteClient.listar(usuario.getId());
	}		

}