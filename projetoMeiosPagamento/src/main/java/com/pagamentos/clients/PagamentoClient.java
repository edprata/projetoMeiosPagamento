package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pagamentos.model.domain.Pagamento;

@FeignClient(url = "localhost:8083/api/pagamento", name = "pagamentoClient")
public interface PagamentoClient {

	@PostMapping(value = "/incluir")
	public Pagamento incluir(@RequestBody Pagamento pagamento);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/")
	public Collection<Pagamento> listar();
	
	@GetMapping(value = "/{idUsuario}")
	public Collection<Pagamento> listar(@PathVariable Long idUsuario);

}
