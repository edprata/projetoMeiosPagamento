package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		if (usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}
	
}