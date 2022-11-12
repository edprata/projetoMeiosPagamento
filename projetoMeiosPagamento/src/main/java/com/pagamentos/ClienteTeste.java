package com.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.ClienteService;
import com.pagamentos.model.service.UsuarioService;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {
	
	@Autowired
	private ClienteService ClienteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Cliente... ");
		Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		ClienteService.incluir(new Cliente("Isaias", "1111111", "isaias@gmail.com", usuario));
		ClienteService.incluir(new Cliente("Malaquias", "2222222", "malaquias@gmail.com", usuario));
		ClienteService.incluir(new Cliente("Adonias", "3333333", "adonias@gmail.com", usuario));
		System.out.println("OK!");
	}

}
