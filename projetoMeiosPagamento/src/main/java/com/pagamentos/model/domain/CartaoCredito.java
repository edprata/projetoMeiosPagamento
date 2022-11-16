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
public class CartaoCredito extends MeioPagamento {
	
	private Long id;
	private String numeroCartao;
	private String nomeTitular;
	private String validade;
	
	public CartaoCredito(
			Double valorPagamento, 
			LocalDateTime dataHoraPagamento, 
			Boolean ativo, 
			String numeroCartao, 
			String nomeTitular, 
			String validade,
			List<Pagamento> pagamentos,
			Long idUsuario
	) {
		super(valorPagamento, dataHoraPagamento, ativo, pagamentos, idUsuario);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.validade = validade;
	}
	
	public String getDescricao() {
		return this.getClass().getSimpleName() + " " + numeroCartao;
	}
	
}
