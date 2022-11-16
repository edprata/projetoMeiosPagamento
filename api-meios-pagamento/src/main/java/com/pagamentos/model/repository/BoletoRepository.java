package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Boleto;

@Repository
public interface BoletoRepository extends CrudRepository<Boleto, Long> {

}