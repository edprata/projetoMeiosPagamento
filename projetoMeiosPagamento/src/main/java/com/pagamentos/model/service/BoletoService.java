package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Boleto;
import com.pagamentos.model.repository.BoletoRepository;


@Service
public class BoletoService {
	
	@Autowired
	private BoletoRepository BoletoRepository;

	public void incluir(Boleto Boleto) {
		BoletoRepository.save(Boleto);
	}
	
	public void excluir(Long id) {
		BoletoRepository.deleteById(id);
	}
	
	public Collection<Boleto> obterLista(){
		return (Collection<Boleto>) BoletoRepository.findAll();
	}		
}