package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Pagamento;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {

}