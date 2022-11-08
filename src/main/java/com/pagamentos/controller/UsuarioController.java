package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.UsuarioService;


@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping(value = "/usuario/incluir")
	public String incluir() {
		return "usuario/incluir";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		usuarioService.incluir(usuario);
		return "redirect:/usuario/lista";
	}
	
	@GetMapping(value = "/usuario/lista")
	public String listar(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());
		return "usuario/lista";
	}

	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		usuarioService.excluir(id);
		return "redirect:/usuario/lista";
	}
}