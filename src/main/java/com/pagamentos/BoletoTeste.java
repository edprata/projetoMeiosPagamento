package com.pagamentos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Boleto;
import com.pagamentos.model.service.BoletoService;

@Order(4)
@Component
public class BoletoTeste implements ApplicationRunner {
	
	@Autowired
	private BoletoService BoletoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Boletos... ");
		BoletoService.incluir(new Boleto(111.00, new Date(), true, "1111111", 111, 111, 111));
		BoletoService.incluir(new Boleto(222.00, new Date(), true, "2222222", 222, 222, 222));
		BoletoService.incluir(new Boleto(333.00, new Date(), true, "3333333", 333, 333, 333));
		System.out.println("OK!");
	}

}
