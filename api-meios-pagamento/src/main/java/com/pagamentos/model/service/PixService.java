package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Pix;
import com.pagamentos.model.repository.PixRepository;


@Service
public class PixService {
	
	@Autowired
	private PixRepository pixRepository;

	public Pix incluir(Pix pix) {
		return pixRepository.save(pix);
	}
	
	public void excluir(Long id) {
		pixRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		pixRepository.deleteAll();
	}
	
	public Collection<Pix> listar(){
		return (Collection<Pix>) pixRepository.findAll();
	}		
}