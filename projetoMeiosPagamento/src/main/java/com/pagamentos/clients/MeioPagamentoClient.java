package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pagamentos.model.domain.MeioPagamento;

@FeignClient(url = "localhost:8083/api/meioPagamento", name = "meioPagamentoClient")
public interface MeioPagamentoClient {

	@PostMapping(value = "/incluir")
	public MeioPagamento incluir(@RequestBody MeioPagamento meioPagamento);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/")
	public Collection<MeioPagamento> listar();
	
	@GetMapping(value = "/{idUsuario}")
	public Collection<MeioPagamento> listar(@PathVariable Long idUsuario);

}
