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
@Table(name = "tboleto")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Boleto extends MeioPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numeroBoleto;
	private Integer numeroBanco;
	private Integer numeroAgencia;
	private Integer numeroConta;

	public Boleto(
			Double valorPagamento, 
			Date dataHoraPagamento, 
			Boolean ativo, 
			String numeroBoleto,
			Integer numeroBanco, 
			Integer numeroAgencia, 
			Integer numeroConta
	) {
		super(valorPagamento, dataHoraPagamento, ativo);
		this.numeroBoleto = numeroBoleto;
		this.numeroBanco = numeroBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}

}
