package com.calculadora.materiais.dto;

import java.util.List;

public class CalculoConcretoRequest {
    private List<ArestaDTO> arestas;
    private Double alturaViga;

    public CalculoConcretoRequest() {}

    public List<ArestaDTO> getArestas() {
        return arestas;
    }

    public void setArestas(List<ArestaDTO> arestas) {
        this.arestas = arestas;
    }

    public Double getAlturaViga() {
        return alturaViga;
    }

    public void setAlturaViga(Double alturaViga) {
        this.alturaViga = alturaViga;
    }
}
