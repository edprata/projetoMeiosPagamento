package com.pagamentos.controller;

import java.text.MessageFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class CustomErrorController {

	@RequestMapping("errors")
	public String customError(HttpServletRequest request, HttpServletResponse response, Model model) {

		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		String exceptionMessage = getExceptionMessage(throwable, statusCode);

		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}

		String message = MessageFormat.format("{0} returned for {1} with message {3}", statusCode, requestUri, exceptionMessage);
		model.addAttribute("errorMessage", message);
		return "errorPage";
	}

	private String getExceptionMessage(Throwable throwable, Integer statusCode) {
		if (throwable != null) {
			return throwable.getCause().getMessage();
		}
		return HttpStatus.valueOf(statusCode).getReasonPhrase();
	}
}