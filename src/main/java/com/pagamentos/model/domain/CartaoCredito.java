package com.pagamentos.model.domain;

import java.util.Date;

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
			Date dataHoraPagamento, 
			Boolean ativo, 
			String numeroCartao, 
			String nomeTitular, 
			String validade
	) {
		super(valorPagamento, dataHoraPagamento, ativo);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.validade = validade;
	}
	
}
