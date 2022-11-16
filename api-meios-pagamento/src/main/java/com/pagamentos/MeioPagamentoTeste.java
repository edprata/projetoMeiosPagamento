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
import com.pagamentos.model.service.MeioPagamentoService;

@Order(2)
@Component
public class MeioPagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private MeioPagamentoService meioPagamentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Meio de Pagamento... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		Long idUser = 1L;
		meioPagamentoService.excluirTodos();
		meioPagamentoService.incluir(new MeioPagamento(111.00, LocalDateTime.now(), true, pagamentos, idUser));
		meioPagamentoService.incluir(new MeioPagamento(222.00, LocalDateTime.now(), true, pagamentos, idUser));
		meioPagamentoService.incluir(new MeioPagamento(333.00, LocalDateTime.now(), true, pagamentos, idUser));
		System.out.println("OK!");
	}

}
