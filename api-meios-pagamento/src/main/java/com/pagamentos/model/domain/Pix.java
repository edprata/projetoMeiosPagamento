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
@Table(name = "tpix")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Pix extends MeioPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numeroTransacao;
	private String chavePix;
	private String descricao;
	
	public Pix(
			Double valorPagamento, 
			LocalDateTime dataHoraPagamento, 
			Boolean ativo, 
			String numeroTransacao, 
			String chavePix,
			String descricao,
			List<Pagamento> pagamentos,
			Long idUsuario
	) {
		super(valorPagamento, dataHoraPagamento, ativo, pagamentos, idUsuario);
		this.numeroTransacao = numeroTransacao;
		this.chavePix = chavePix;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return this.getClass().getSimpleName() + " " + numeroTransacao;
	}
	
}
