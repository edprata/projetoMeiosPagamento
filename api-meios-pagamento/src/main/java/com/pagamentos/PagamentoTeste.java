package com.pagamentos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.Cliente;
import com.pagamentos.model.domain.MeioPagamento;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.service.ClienteService;
import com.pagamentos.model.service.PagamentoService;

@Order(6)
@Component
public class PagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private PagamentoService pagamentoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Pagamento... ");
		Cliente cliente = clienteService.findByEmail("isaias@gmail.com");
		Long idUser = 1L;
		List<MeioPagamento> lista = new ArrayList<>();
		pagamentoService.excluirTodos();
		pagamentoService.incluir(new Pagamento(1L, 111.00, cliente, lista, idUser));
		pagamentoService.incluir(new Pagamento(2L, 222.00, cliente, lista, idUser));
		pagamentoService.incluir(new Pagamento(3L, 333.00, cliente, lista, idUser));
		System.out.println("OK!");
	}

}
