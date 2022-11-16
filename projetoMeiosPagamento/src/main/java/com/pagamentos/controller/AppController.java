package com.pagamentos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, HttpSession session, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if (usuario == null) {
			return "login";	
		}
		
		session.setAttribute("user", usuario);
		model.addAttribute("user", usuario);
		return "home";
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/login";
	}
    
}
