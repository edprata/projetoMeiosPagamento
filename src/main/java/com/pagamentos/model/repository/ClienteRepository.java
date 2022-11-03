package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}