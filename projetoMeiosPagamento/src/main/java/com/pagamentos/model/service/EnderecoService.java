package com.pagamentos.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamentos.clients.IEnderecoClient;
import com.pagamentos.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}

}
