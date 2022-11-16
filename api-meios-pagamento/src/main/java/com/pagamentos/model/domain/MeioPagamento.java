package com.pagamentos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
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
	private LocalDateTime dataHoraPagamento;
	private Boolean ativo;
	
	@ManyToMany(mappedBy = "meiosPagamento")
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
