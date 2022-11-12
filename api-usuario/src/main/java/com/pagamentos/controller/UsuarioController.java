package com.pagamentos.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping(value = "/incluir")
	public Usuario incluir(@RequestBody Usuario usuario) {
		return usuarioService.incluir(usuario);
	}
	
	@GetMapping(value = "/{email}")
	public Usuario findByEmail(@PathVariable String email) {
		return usuarioService.findByEmail(email);
	}
	
	@GetMapping(value = "/")
	public Collection<Usuario> listar() {
		return usuarioService.listar();
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		usuarioService.excluir(id);
	}
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		return usuarioService.validar(email, senha);
	}
	
}