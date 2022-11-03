package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.MeioPagamento;

@Repository
public interface MeioPagamentoRepository extends CrudRepository<MeioPagamento, Long> {

}