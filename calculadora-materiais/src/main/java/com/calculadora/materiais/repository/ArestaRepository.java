package com.calculadora.materiais.repository;

import com.calculadora.materiais.entity.Aresta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArestaRepository extends JpaRepository<Aresta, Long> {
    List<Aresta> findByGrafoId(Long grafoId);
}
