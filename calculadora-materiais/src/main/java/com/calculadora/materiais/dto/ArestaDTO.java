package com.calculadora.materiais.dto;

public class ArestaDTO {
    private Double espessura; // largura da parede/viga
    private Double comprimento;
    private Double altura;
    private Double areaAberturas; // para portas e janelas

    public ArestaDTO() {}

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
}
