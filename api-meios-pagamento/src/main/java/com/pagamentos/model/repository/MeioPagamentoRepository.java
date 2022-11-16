package com.pagamentos.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.MeioPagamento;

@Repository
public interface MeioPagamentoRepository extends CrudRepository<MeioPagamento, Long> {
	
	@Query("from MeioPagamento p where p.idUsuario =:idUsuario")
	List<MeioPagamento> listar(Long idUsuario);


}