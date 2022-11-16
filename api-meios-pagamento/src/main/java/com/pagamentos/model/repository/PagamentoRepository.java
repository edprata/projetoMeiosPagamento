package com.pagamentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Pagamento;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {

	@Query("from Pagamento p where p.idUsuario =:idUsuario")
	List<Pagamento> listar(Long idUsuario);
	
}