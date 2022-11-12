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
			LocalDateTime dataHoraPagamento, 
			Boolean ativo, 
			String numeroBoleto,
			Integer numeroBanco, 
			Integer numeroAgencia, 
			Integer numeroConta,
			List<Pagamento> pagamentos,
			Usuario usuario
	) {
		super(valorPagamento, dataHoraPagamento, ativo, pagamentos, usuario);
		this.numeroBoleto = numeroBoleto;
		this.numeroBanco = numeroBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}
	
	public String getNome() {
		return this.getClass().getSimpleName() + " " + numeroBoleto;
	}

}
