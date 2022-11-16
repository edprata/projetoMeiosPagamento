package com.pagamentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Boleto extends MeioPagamento {

	private Long id;
	private String numeroBoleto;
	private Integer numeroBanco;
	private Integer numeroAgencia;
	private Integer numeroConta;

	public Boleto(
			Double valorPagamento, 
			LocalDateTime dataHoraPagamento, 
			Boolean ativo, 
			String numeroBoleto,
			Integer numeroBanco, 
			Integer numeroAgencia, 
			Integer numeroConta,
			List<Pagamento> pagamentos,
			Long idUsuario
	) {
		super(valorPagamento, dataHoraPagamento, ativo, pagamentos, idUsuario);
		this.numeroBoleto = numeroBoleto;
		this.numeroBanco = numeroBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}
	
	public String getNome() {
		return this.getClass().getSimpleName() + " " + numeroBoleto;
	}

}
