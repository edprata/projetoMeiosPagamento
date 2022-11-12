package com.pagamentos.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tusuario")

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Cliente> clientes;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Pagamento> pagamentos;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<MeioPagamento> meiosPagamento;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idendereco")
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
