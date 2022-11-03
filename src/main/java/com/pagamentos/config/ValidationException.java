package com.pagamentos.config;

import java.util.List;

import com.pagamentos.model.domain.Erro;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private List<Erro> erros;

	public ValidationException() {
		super();
	}

	public ValidationException(List<Erro> erros) {
		super("Ocorreram erros de validação.");
		this.erros = erros;
	}

}