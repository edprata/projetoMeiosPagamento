package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pagamentos.model.service.CartaoCreditoService;


@Controller
public class CartaoCreditoController {

	@Autowired
	private CartaoCreditoService cartaoCreditoService;

	@GetMapping(value = "/cartaoCredito/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", cartaoCreditoService.obterLista());
		return "cartaoCredito/lista";
	}

	@GetMapping(value = "/cartaoCredito/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		cartaoCreditoService.excluir(id);
		return "redirect:/cartaoCredito/lista";
	}
}