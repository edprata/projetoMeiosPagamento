package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.PixClient;
import com.pagamentos.model.domain.Pix;


@Service
public class PixService {
	
	@Autowired
	private PixClient pixClient;

	public void incluir(Pix pix) {
		System.out.println("PIX=" + pix);
		pixClient.incluir(pix);
	}
	
	public void excluir(Long id) {
		pixClient.excluir(id);
	}
	
	public Collection<Pix> obterLista(){
		return (Collection<Pix>) pixClient.listar();
	}		
}