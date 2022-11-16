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
public class Pagamento {

	private Long id;
	private Long numeroTransacao;
	private LocalDateTime dataHoraTransacao;
	private Double valorTotal;
	private Cliente cliente;
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
