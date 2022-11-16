package com.pagamentos.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private Endereco endereco;
	
	public Usuario(Long id) {
		this.id = id;
	}

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

}
