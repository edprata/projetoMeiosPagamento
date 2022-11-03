package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Pix;
import com.pagamentos.model.repository.PixRepository;


@Service
public class PixService {
	
	@Autowired
	private PixRepository PixRepository;

	public void incluir(Pix Pix) {
		PixRepository.save(Pix);
	}
	
	public void excluir(Long id) {
		PixRepository.deleteById(id);
	}
	
	public Collection<Pix> obterLista(){
		return (Collection<Pix>) PixRepository.findAll();
	}		
}