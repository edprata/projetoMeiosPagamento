package com.pagamentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
	private LocalDateTime dataHoraTransacao;
	private Double valorTotal;

	//@ManyToOne(cascade = CascadeType.ALL)
	//private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.DETACH)
	private List<MeioPagamento> meiosPagamento;
	
	private Long idUsuario;

	public Pagamento(
			Long numeroTransacao, 
			Double valorTotal, 
			Cliente cliente,
			List<MeioPagamento> meiosPagamento,
			Long idUsuario
	) {
		super();
		this.numeroTransacao = numeroTransacao;
		this.dataHoraTransacao = LocalDateTime.now();
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.meiosPagamento = meiosPagamento;
		this.idUsuario = idUsuario;
	}

}
