package com.pagamentos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.CartaoCredito;
import com.pagamentos.model.service.CartaoCreditoService;

@Order(5)
@Component
public class CartaoCreditoTeste implements ApplicationRunner {
	
	@Autowired
	private CartaoCreditoService CartaoCreditoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Cartão de Crédito... ");
		CartaoCreditoService.incluir(new CartaoCredito(111.00, new Date(), true, "1111111", "Katia", "10/27"));
		CartaoCreditoService.incluir(new CartaoCredito(222.00, new Date(), true, "2222222", "Flavia", "07/24"));
		CartaoCreditoService.incluir(new CartaoCredito(333.00, new Date(), true, "3333333", "Bodiva", "08/25"));
		System.out.println("OK!");
	}

}
