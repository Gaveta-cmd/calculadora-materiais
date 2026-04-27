package com.calculadora.materiais.dto;

import java.util.List;

public class CalculoTijolosRequest {
    private List<ArestaDTO> arestas;
    private TijoloDTO tijolo;

    public CalculoTijolosRequest() {}

    public List<ArestaDTO> getArestas() {
        return arestas;
    }

    public void setArestas(List<ArestaDTO> arestas) {
        this.arestas = arestas;
    }

    public TijoloDTO getTijolo() {
        return tijolo;
    }

    public void setTijolo(TijoloDTO tijolo) {
        this.tijolo = tijolo;
    }
}
