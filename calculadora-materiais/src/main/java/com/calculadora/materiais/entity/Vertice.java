package com.calculadora.materiais.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vertice")
public class Vertice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "grafo_id")
    private Grafo grafo;

    public Vertice() {}

    public Vertice(String nome, Grafo grafo) {
        this.nome = nome;
        this.grafo = grafo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
}
