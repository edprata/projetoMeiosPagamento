package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pagamentos.model.service.BoletoService;


@Controller
public class BoletoController {

	@Autowired
	private BoletoService boletoService;
	
	
	@GetMapping(value = "/boleto/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", boletoService.obterLista());
		return "boleto/lista";
	}

	@GetMapping(value = "/boleto/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		boletoService.excluir(id);
		return "redirect:/boleto/lista";
	}
}