package com.pagamentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.domain.Pix;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.PixService;
import com.pagamentos.model.service.UsuarioService;

@Order(6)
@Component
public class PixTeste implements ApplicationRunner {
	
	@Autowired
	private PixService pixService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de PIX... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		pixService.incluir(new Pix(111.00, LocalDateTime.now(), true, "1111111", "1111111", "Teste1", pagamentos, usuario));
		pixService.incluir(new Pix(222.00, LocalDateTime.now(), true, "2222222", "2222222", "Teste2", pagamentos, usuario));
		pixService.incluir(new Pix(333.00, LocalDateTime.now(), true, "3333333", "3333333", "Teste1", pagamentos, usuario));
		System.out.println("OK!");
	}

}
