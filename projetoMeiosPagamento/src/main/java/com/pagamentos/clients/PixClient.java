package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pagamentos.model.domain.Pix;

@FeignClient(url = "localhost:8083/api/pix", name = "pixClient")
public interface PixClient {

	@PostMapping(value = "/incluir")
	public Pix incluir(@RequestBody Pix pix);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/")
	public Collection<Pix> listar();

}
