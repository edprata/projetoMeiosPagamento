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

import com.pagamentos.model.domain.CartaoCredito;
import com.pagamentos.model.service.CartaoCreditoService;


@RestController
@RequestMapping("/api/cartaoCredito")
public class CartaoCreditoController {

	@Autowired
	private CartaoCreditoService cartaoCreditoService;
	
	
	@PostMapping(value = "/incluir")
	public CartaoCredito incluir(@RequestBody CartaoCredito cartaoCredito) {
		return cartaoCreditoService.incluir(cartaoCredito);
	}
	
	@GetMapping(value = "/")
	public Collection<CartaoCredito> listar() {
		return cartaoCreditoService.listar();
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		cartaoCreditoService.excluir(id);
	}
	
	
}