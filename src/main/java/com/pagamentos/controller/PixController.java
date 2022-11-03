package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pagamentos.model.service.PixService;


@Controller
public class PixController {

	@Autowired
	private PixService pixService;

	@GetMapping(value = "/pix/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", pixService.obterLista());
		return "pix/lista";
	}

	@GetMapping(value = "/pix/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		pixService.excluir(id);
		return "redirect:/pix/lista";
	}
}