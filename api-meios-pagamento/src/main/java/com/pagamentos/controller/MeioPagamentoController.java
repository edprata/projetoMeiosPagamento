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

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.service.MeioPagamentoService;


@RestController
@RequestMapping("/api/meioPagamento")
public class MeioPagamentoController {

	@Autowired
	private MeioPagamentoService meioPagamentoService;
	
	@PostMapping(value = "/incluir")
	public MeioPagamento incluir(@RequestBody MeioPagamento meioPagamento) {
		return meioPagamentoService.incluir(meioPagamento);
	}
	
	@GetMapping(value = "/")
	public Collection<MeioPagamento> listar() {
		return meioPagamentoService.listar();
	}
	
	@GetMapping(value = "/{idUsuario}")
	public Collection<MeioPagamento> listar(@PathVariable Long idUsuario) {
		return meioPagamentoService.listar(idUsuario);
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		meioPagamentoService.excluir(id);
	}
	
}