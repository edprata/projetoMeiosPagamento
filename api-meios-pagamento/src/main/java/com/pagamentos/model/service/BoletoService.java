package com.pagamentos.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.model.domain.Boleto;
import com.pagamentos.model.repository.BoletoRepository;


@Service
public class BoletoService {
	
	@Autowired
	private BoletoRepository boletoRepository;

	public Boleto incluir(Boleto Boleto) {
		return boletoRepository.save(Boleto);
	}
	
	public void excluir(Long id) {
		boletoRepository.deleteById(id);
	}
	
	public void excluirTodos() {
		boletoRepository.deleteAll();
	}
	
	public Collection<Boleto> listar(){
		return (Collection<Boleto>) boletoRepository.findAll();
	}		
}