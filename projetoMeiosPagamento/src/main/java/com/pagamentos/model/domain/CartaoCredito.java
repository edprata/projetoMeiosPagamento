package com.pagamentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tcartaocredito")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CartaoCredito extends MeioPagamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
			Usuario usuario
	) {
		super(valorPagamento, dataHoraPagamento, ativo, pagamentos, usuario);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.validade = validade;
	}
	
	public String getDescricao() {
		return this.getClass().getSimpleName() + " " + numeroCartao;
	}
	
}
