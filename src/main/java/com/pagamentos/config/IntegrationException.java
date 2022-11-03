package com.pagamentos.config;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class IntegrationException extends RuntimeException {

private static final long serialVersionUID = 1L;

	public IntegrationException(String mensagem) {
		super(mensagem);
	}

	public IntegrationException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}
}
