package com.pagamentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.MeioPagamentoService;
import com.pagamentos.model.service.UsuarioService;

@Order(3)
@Component
public class MeioPagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private MeioPagamentoService MeioPagamentoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Meio de Pagamento... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		MeioPagamentoService.incluir(new MeioPagamento(111.00, LocalDateTime.now(), true, pagamentos, usuario));
		MeioPagamentoService.incluir(new MeioPagamento(222.00, LocalDateTime.now(), true, pagamentos, usuario));
		MeioPagamentoService.incluir(new MeioPagamento(333.00, LocalDateTime.now(), true, pagamentos, usuario));
		System.out.println("OK!");
	}

}
