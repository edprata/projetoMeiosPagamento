package com.pagamentos.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.service.ClienteService;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value = "/incluir")
	public Cliente incluir(@RequestBody Cliente cliente) {
		return clienteService.incluir(cliente);
	}
	
	@GetMapping(value = "/listarPorId/{idUsuario}")
	public Collection<Cliente> listar(@PathVariable Long idUsuario) {
		return clienteService.listar(idUsuario);
	}
	
	@GetMapping(value = "/listarPorEmail/{email}")
	public Cliente listar(@PathVariable String email) {
		return clienteService.findByEmail(email);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		clienteService.excluir(id);
	}
	
}