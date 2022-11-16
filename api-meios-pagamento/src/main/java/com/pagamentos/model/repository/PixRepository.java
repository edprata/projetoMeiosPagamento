package com.pagamentos.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pagamentos.model.domain.Pix;

@Repository
public interface PixRepository extends CrudRepository<Pix, Long> {

}