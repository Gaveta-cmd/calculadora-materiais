package com.calculadora.materiais.repository;

import com.calculadora.materiais.entity.Comodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComodoRepository extends JpaRepository<Comodo, Long> {
}
