package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pagamentos.model.domain.Cliente;

@FeignClient(url = "localhost:8083/api/cliente", name = "clienteClient")
public interface ClienteClient {

	@PostMapping(value = "/incluir")
	public Cliente incluir(@RequestBody Cliente cliente);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/listarPorId/{idUsuario}")
	public Collection<Cliente> listar(@PathVariable Long idUsuario);
	
	@GetMapping(value = "/listarPorEmail/{email}")
	public Cliente listar(@PathVariable String email);

}
