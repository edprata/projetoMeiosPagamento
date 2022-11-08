package com.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {
	
	@Autowired
	private UsuarioService UsuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Usuario... ");
		UsuarioService.incluir(new Usuario("Jacó", "jaco@gmail.com", "111"));
		UsuarioService.incluir(new Usuario("José", "jose@gmail.com", "222"));
		UsuarioService.incluir(new Usuario("Jonas", "jonas@gmail.com", "333"));
		System.out.println("OK!");
	}

}
