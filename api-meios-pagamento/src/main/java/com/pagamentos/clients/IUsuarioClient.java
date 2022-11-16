package com.pagamentos.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pagamentos.model.domain.Usuario;

@Service
@FeignClient(url = "localhost:8082/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {

	@PostMapping(value = "/incluir")
	public Usuario incluir(@RequestBody Usuario usuario);
	
	@GetMapping(value = "/{email}")
	public Usuario findByEmail(@PathVariable String email);
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable Long id);

	@GetMapping(value = "/")
	public Collection<Usuario> listar();

	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha);

}
