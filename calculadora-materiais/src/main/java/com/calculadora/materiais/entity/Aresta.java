package com.calculadora.materiais.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aresta")
public class Aresta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "origem_id")
    private Vertice origem;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Vertice destino;

    private Double espessura;
    private Double comprimento;
    private Double altura;
    private Double areaAberturas; // Area total de portas e janelas para descontar no calculo de tijolos

    @ManyToOne
    @JoinColumn(name = "grafo_id")
    private Grafo grafo;

    public Aresta() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Double getEspessura() {
        return espessura;
    }

    public void setEspessura(Double espessura) {
        this.espessura = espessura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAreaAberturas() {
        return areaAberturas != null ? areaAberturas : 0.0;
    }

    public void setAreaAberturas(Double areaAberturas) {
        this.areaAberturas = areaAberturas;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
}
