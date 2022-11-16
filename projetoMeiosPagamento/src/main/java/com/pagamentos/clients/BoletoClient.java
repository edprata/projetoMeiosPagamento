package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pagamentos.model.domain.Boleto;

@FeignClient(url = "localhost:8083/api/boleto", name = "boletoClient")
public interface BoletoClient {

	@PostMapping(value = "/incluir")
	public Boleto incluir(@RequestBody Boleto boleto);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);
	
	@DeleteMapping(value = "/")
	public void excluirTodos();

	@GetMapping(value = "/")
	public Collection<Boleto> listar();

}
