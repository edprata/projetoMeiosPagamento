package com.pagamentos.model.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Erro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String campo;
	private String mensagem;
	private String exception;

	public Erro(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}
}
