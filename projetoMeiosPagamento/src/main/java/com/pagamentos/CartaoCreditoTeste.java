package com.pagamentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pagamentos.model.domain.CartaoCredito;
import com.pagamentos.model.domain.Pagamento;
import com.pagamentos.model.domain.Usuario;
import com.pagamentos.model.service.CartaoCreditoService;
import com.pagamentos.model.service.UsuarioService;

@Order(5)
@Component
public class CartaoCreditoTeste implements ApplicationRunner {
	
	@Autowired
	private CartaoCreditoService CartaoCreditoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.print("## Cadastramento de Cartão de Crédito... ");
		List<Pagamento> pagamentos = new ArrayList<>();
		Usuario usuario = usuarioService.findByEmail("jaco@gmail.com");
		CartaoCreditoService.incluir(new CartaoCredito(111.00, LocalDateTime.now(), true, "1111111", "Katia", "10/27", pagamentos, usuario));
		CartaoCreditoService.incluir(new CartaoCredito(222.00, LocalDateTime.now(), true, "2222222", "Flavia", "07/24", pagamentos, usuario));
		CartaoCreditoService.incluir(new CartaoCredito(333.00, LocalDateTime.now(), true, "3333333", "Bodiva", "08/25", pagamentos, usuario));
		System.out.println("OK!");
	}

}
