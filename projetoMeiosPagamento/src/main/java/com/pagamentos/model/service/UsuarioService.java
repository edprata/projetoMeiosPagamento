package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.IUsuarioClient;
import com.pagamentos.model.domain.Usuario;


@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioClient usuarioClient;

	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}
	
	public void excluir(Long id) {
		usuarioClient.excluir(id);
	}

	public Collection<Usuario> listar(){
		return (Collection<Usuario>) usuarioClient.listar();
	}
	
	public Usuario findByEmail(String email) {
		return usuarioClient.findByEmail(email);
	}
	
	public Usuario validar(String email, String senha) {
		return usuarioClient.validar(email, senha);
	}	

}