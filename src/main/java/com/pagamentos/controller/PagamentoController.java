package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pagamentos.model.service.PagamentoService;


@Controller
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoService;

	@GetMapping(value = "/pagamento/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", pagamentoService.obterLista());
		return "pagamento/lista";
	}

	@GetMapping(value = "/pagamento/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		pagamentoService.excluir(id);
		return "redirect:/pagamento/lista";
	}
}