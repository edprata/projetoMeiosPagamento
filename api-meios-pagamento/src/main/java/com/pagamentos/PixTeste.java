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
import com.pagamentos.model.service.PixService;

@Order(5)
@Component
public class PixTeste implements ApplicationRunner {
	
	@Autowired
	private PixService pixService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de PIX... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		Long idUser = 1L;
		pixService.excluirTodos();
		pixService.incluir(new Pix(111.00, LocalDateTime.now(), true, "1111111", "1111111", "Teste1", pagamentos, idUser));
		pixService.incluir(new Pix(222.00, LocalDateTime.now(), true, "2222222", "2222222", "Teste2", pagamentos, idUser));
		pixService.incluir(new Pix(333.00, LocalDateTime.now(), true, "3333333", "3333333", "Teste1", pagamentos, idUser));
		System.out.println("OK!");
	}

}
