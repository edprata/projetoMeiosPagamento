package com.pagamentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	Cliente findByEmail(String email);
	
	@Query("from Cliente c where c.idUsuario = :idUsuario")
	List<Cliente> listar(Long idUsuario);

}