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

import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.service.PagamentoService;


@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoService;

	@PostMapping(value = "/incluir")
	public Pagamento incluir(@RequestBody Pagamento pagamento) {
		return pagamentoService.incluir(pagamento);
	}
	
	@GetMapping(value = "/")
	public Collection<Pagamento> listar() {
		return pagamentoService.listar();
	}
	
	@GetMapping(value = "/{idUsuario}")
	public Collection<Pagamento> listar(@PathVariable Long idUsuario) {
		return pagamentoService.listar(idUsuario);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		pagamentoService.excluir(id);
	}
	
}