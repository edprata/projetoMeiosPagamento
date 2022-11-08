package com.pagamentos.model.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tpagamento")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long numeroTransacao;
	private Date dataHoraTransacao;
	private Double valorTotal;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<MeioPagamento> meiosPagamento;

	public Pagamento(
			Long numeroTransacao, 
			Date dataHoraTransacao, 
			Double valorTotal, 
			Cliente cliente,
			List<MeioPagamento> meiosPagamento
	) {
		super();
		this.numeroTransacao = numeroTransacao;
		this.dataHoraTransacao = dataHoraTransacao;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.meiosPagamento = meiosPagamento;
	}

}
