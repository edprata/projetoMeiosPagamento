package com.pagamentos.model.domain;

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
@Table(name = "tcliente")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String numeroDocumento;
	private String email;
	private Long idUsuario;
	
	public Cliente(String nome, String numeroDocumento, String email) {
		super();
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.email = email;
	}
	
	public Cliente(String nome, String numeroDocumento, String email, Long idUsuario) {
		this(nome, numeroDocumento, email);
		this.idUsuario = idUsuario;
	}

}
