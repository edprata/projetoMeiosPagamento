package com.pagamentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Boleto;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.service.BoletoService;

@Order(3)
@Component
public class BoletoTeste implements ApplicationRunner {
	
	@Autowired
	private BoletoService boletoService;
	
	//@Autowired
	//private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Boletos... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		//Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		Long idUser = 1L;
		boletoService.excluirTodos();
		boletoService.incluir(new Boleto(111.00, LocalDateTime.now(), true, "1111111", 111, 111, 111, pagamentos, idUser));
		boletoService.incluir(new Boleto(222.00, LocalDateTime.now(), true, "2222222", 222, 222, 222, pagamentos, idUser));
		boletoService.incluir(new Boleto(333.00, LocalDateTime.now(), true, "3333333", 333, 333, 333, pagamentos, idUser));
		System.out.println("OK!");
	}

}
