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
public class MeioPagamento {
	
	private Long id;
	private Double valorPagamento;
	private LocalDateTime dataHoraPagamento;
	private Boolean ativo;
	private List<Pagamento> pagamentos;
	private Long idUsuario;
	
	public MeioPagamento(Double valorPagamento, LocalDateTime dataHoraPagamento, Boolean ativo, List<Pagamento> pagamentos, Long idUsuario) {
		super();
		this.valorPagamento = valorPagamento;
		this.dataHoraPagamento = dataHoraPagamento;
		this.ativo = ativo;
		this.pagamentos = pagamentos;
		this.idUsuario = idUsuario;
	}
	
	public String getNome() {
		return id + " " + this.getClass().getSimpleName();
	}

}
