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
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.ClienteService;
import com.pagamentos.model.service.PagamentoService;
import com.pagamentos.model.service.UsuarioService;

@Order(1)
@Component
public class PagamentoTeste implements ApplicationRunner {
	
	@Autowired
	private PagamentoService PagamentoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Pagamento... ");
		Cliente cliente = clienteService.findByEmail("isaias@gmail.com");
		Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		List<MeioPagamento> lista = new ArrayList<>();
		PagamentoService.incluir(new Pagamento(1L, 111.00, cliente, lista, usuario));
		PagamentoService.incluir(new Pagamento(2L, 222.00, cliente, lista, usuario));
		PagamentoService.incluir(new Pagamento(3L, 333.00, cliente, lista, usuario));
		System.out.println("OK!");
	}

}
