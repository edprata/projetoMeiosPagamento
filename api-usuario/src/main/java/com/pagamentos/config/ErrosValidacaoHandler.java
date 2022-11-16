package com.pagamentos.config;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ErrosValidacaoHandler {
	
	private static Logger log = LogManager.getLogger(ErrosValidacaoHandler.class); 
	
	@Autowired
	private MessageSource messageSource;

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<Erro> handle(MethodArgumentNotValidException exception) {
		return handle(exception.getBindingResult());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BindException.class)
	public List<Erro> handle(BindException exception) {
		return handle(exception.getBindingResult());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public List<Erro> handle(MethodArgumentTypeMismatchException exception) {
		List<Erro> erros = new ArrayList<>();
		erros.add(new Erro(exception.getPropertyName(), exception.getMessage(), exception.getClass().getName()));
		return erros;
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public List<Erro> handle(Exception exception) {
		List<Erro> erros = new ArrayList<>();
		erros.add(new Erro(null, exception.getMessage(), exception.getClass().getName()));
		log.error(exception);
		return erros;
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ValidationException.class)
	public List<Erro> handle(ValidationException exception) {
		return exception.getErros();
	}
	
	public List<Erro> handle(BindingResult bindingResult) {

		List<Erro> erros = new ArrayList<>();
		List<FieldError> lista = bindingResult.getFieldErrors();
		
		lista.forEach(e -> {
			String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
			erros.add(new Erro(e.getField(), mensagem));
		});
		
		return erros;
	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BusinessException.class)
	public List<Erro> handle(BusinessException exception) {
		List<Erro> erros = new ArrayList<>();
		erros.add(new Erro(exception.getCampo(), exception.getMessage()));
		return erros;
	}
}
