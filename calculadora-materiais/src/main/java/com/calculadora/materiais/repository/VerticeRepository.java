package com.calculadora.materiais.repository;

import com.calculadora.materiais.entity.Vertice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerticeRepository extends JpaRepository<Vertice, Long> {
}
