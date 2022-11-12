package com.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.ClienteService;
import com.pagamentos.model.service.MeioPagamentoService;
import com.pagamentos.model.service.PagamentoService;


@Controller
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoService;

	@Autowired
	private MeioPagamentoService meioPagamentoService;
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping(value = "/pagamento/incluir")
	public String incluir(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("meiosPagamento", meioPagamentoService.obterLista(usuario));
		model.addAttribute("clientes", clienteService.listar(usuario));
		return "pagamento/incluir";
	}

	@PostMapping(value = "/pagamento/incluir")
	public String incluir(Pagamento pagamento, @SessionAttribute("user") Usuario usuario) {
		pagamento.setUsuario(usuario);
		pagamentoService.incluir(pagamento);
		return "redirect:/pagamento/lista";
	}

	@GetMapping(value = "/pagamento/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pagamentoService.listar(usuario));
		return "pagamento/lista";
	}

	@GetMapping(value = "/pagamento/{id}/excluir")
	public String exclusao(@PathVariable Long id) {
		pagamentoService.excluir(id);
		return "redirect:/pagamento/lista";
	}
}