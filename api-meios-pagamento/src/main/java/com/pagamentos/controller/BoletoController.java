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

import com.pagamentos.model.domain.Boleto;
import com.pagamentos.model.service.BoletoService;


@RestController
@RequestMapping("/api/boleto")
public class BoletoController {

	@Autowired
	private BoletoService boletoService;
	
	@PostMapping(value = "/incluir")
	public Boleto incluir(@RequestBody Boleto boleto) {
		return boletoService.incluir(boleto);
	}
	
	@GetMapping(value = "/")
	public Collection<Boleto> listar() {
		return boletoService.listar();
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		boletoService.excluir(id);
	}
	
}