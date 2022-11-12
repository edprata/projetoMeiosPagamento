package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.service.MeioPagamentoService;


@Controller
public class MeioPagamentoController {

	@Autowired
	private MeioPagamentoService meioPagamentoService;
	
	@GetMapping(value = "/meioPagamento/incluir")
	public String incluir() {
		return "meioPagamento/incluir";
	}

	@PostMapping(value = "/meioPagamento/incluir")
	public String incluir(MeioPagamento meioPagamento) {
		meioPagamentoService.incluir(meioPagamento);
		return "redirect:/meioPagamento/lista";
	}

	@GetMapping(value = "/meioPagamento/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", meioPagamentoService.obterLista());
		return "meioPagamento/lista";
	}

	@GetMapping(value = "/meioPagamento/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		meioPagamentoService.excluir(id);
		return "redirect:/meioPagamento/lista";
	}
}