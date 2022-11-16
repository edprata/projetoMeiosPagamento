package com.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.service.ClienteService;

@Order(1)
@Component
public class ClienteTeste implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Cliente... ");
		Long idUser = 1L;
		clienteService.excluirTodos();
		clienteService.incluir(new Cliente("Isaias", "1111111", "isaias@gmail.com", idUser));
		clienteService.incluir(new Cliente("Malaquias", "2222222", "malaquias@gmail.com", idUser));
		clienteService.incluir(new Cliente("Adonias", "3333333", "adonias@gmail.com", idUser));
		System.out.println("OK!");
	}

}
