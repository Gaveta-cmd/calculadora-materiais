package com.calculadora.materiais.repository;

import com.calculadora.materiais.entity.Grafo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrafoRepository extends JpaRepository<Grafo, Long> {
}
