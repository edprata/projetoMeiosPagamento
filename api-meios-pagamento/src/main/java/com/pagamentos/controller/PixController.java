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

import com.pagamentos.model.domain.Pix;
import com.pagamentos.model.service.PixService;


@RestController
@RequestMapping("/api/pix")
public class PixController {

	@Autowired
	private PixService pixService;
	
	@PostMapping(value = "/incluir")
	public Pix incluir(@RequestBody Pix pix) {
		System.out.println("PIX=" + pix);
		return pixService.incluir(pix);
	}
	
	@GetMapping(value = "/")
	public Collection<Pix> listar() {
		return pixService.listar();
	}

	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id) {
		pixService.excluir(id);
	}
	
}