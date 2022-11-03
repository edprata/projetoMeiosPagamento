package com.pagamentos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.service.PagamentoService;

@Order(1)
@Component
public class PagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private PagamentoService PagamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Pagamento... ");
		List<MeioPagamento> lista = new ArrayList<>();
		PagamentoService.incluir(new Pagamento(1L, new Date(), 111.00, new Cliente("João", "11111111", "joao@gmail.com"), lista));
		PagamentoService.incluir(new Pagamento(2L, new Date(), 222.00, new Cliente("Maria", "22222222", "maria@gmail.com"), lista));
		PagamentoService.incluir(new Pagamento(3L, new Date(), 333.00, new Cliente("Josefa", "33333333", "josefa@gmail.com"), lista));
		System.out.println("OK!");
	}

}
