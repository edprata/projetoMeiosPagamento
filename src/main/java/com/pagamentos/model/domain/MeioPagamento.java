package com.pagamentos.model.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tmeiopagamento")
@Inheritance(strategy = InheritanceType.JOINED)

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MeioPagamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Double valorPagamento;
	private Date dataHoraPagamento;
	private Boolean ativo;
	
	public MeioPagamento(Double valorPagamento, Date dataHoraPagamento, Boolean ativo) {
		super();
		this.valorPagamento = valorPagamento;
		this.dataHoraPagamento = dataHoraPagamento;
		this.ativo = ativo;
	}

}
