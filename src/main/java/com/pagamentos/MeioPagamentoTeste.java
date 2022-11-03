package com.pagamentos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.service.MeioPagamentoService;

@Order(3)
@Component
public class MeioPagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private MeioPagamentoService MeioPagamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Meio de Pagamento... ");
		MeioPagamentoService.incluir(new MeioPagamento(111.00, new Date(), true));
		MeioPagamentoService.incluir(new MeioPagamento(222.00, new Date(), true));
		MeioPagamentoService.incluir(new MeioPagamento(333.00, new Date(), true));
		System.out.println("OK!");
	}

}
