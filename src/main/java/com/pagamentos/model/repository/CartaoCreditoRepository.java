package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.CartaoCredito;

@Repository
public interface CartaoCreditoRepository extends CrudRepository<CartaoCredito, Long> {

}