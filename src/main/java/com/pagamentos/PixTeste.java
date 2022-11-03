package com.pagamentos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Pix;
import com.pagamentos.model.service.PixService;

@Order(6)
@Component
public class PixTeste implements ApplicationRunner {
	
	@Autowired
	private PixService pixService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de PIX... ");
		pixService.incluir(new Pix(111.00, new Date(), true, "1111111", "1111111", "Teste1"));
		pixService.incluir(new Pix(222.00, new Date(), true, "2222222", "2222222", "Teste2"));
		pixService.incluir(new Pix(333.00, new Date(), true, "3333333", "3333333", "Teste1"));
		System.out.println("OK!");
	}

}
