package com.calculadora.materiais.service;

import com.calculadora.materiais.dto.ArestaDTO;
import com.calculadora.materiais.dto.CalculoConcretoRequest;
import com.calculadora.materiais.dto.CalculoTijolosRequest;
import com.calculadora.materiais.dto.TijoloDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculoService {

    /**
     * Servico 1 - Volume de Concreto (Viga Baldrame)
     * Calculo: Volume = Largura(Espessura da Parede) * Altura (Viga) * Comprimento (Parede)
     */
    public Double calcularVolumeConcreto(CalculoConcretoRequest request) {
        double volumeTotal = 0.0;
        
        if (request.getArestas() == null || request.getAlturaViga() == null) {
            return volumeTotal;
        }

        for (ArestaDTO aresta : request.getArestas()) {
            double espessura = aresta.getEspessura() != null ? aresta.getEspessura() : 0.0;
            double comprimento = aresta.getComprimento() != null ? aresta.getComprimento() : 0.0;
            volumeTotal += (espessura * request.getAlturaViga() * comprimento);
        }

        return volumeTotal;
    }

    /**
     * Servico 2 - Quantidade de Tijolos
     * Calculo: (Area da Parede - Area de Aberturas) / Area da face do Tijolo
     */
    public Integer calcularQuantidadeTijolos(CalculoTijolosRequest request) {
        if (request.getArestas() == null || request.getTijolo() == null) {
            return 0;
        }

        TijoloDTO tijolo = request.getTijolo();
        double areaTijolo = (tijolo.getComprimento() != null ? tijolo.getComprimento() : 0.0) *
                            (tijolo.getAltura() != null ? tijolo.getAltura() : 0.0);

        if (areaTijolo <= 0) {
            throw new IllegalArgumentException("Dimensoes do tijolo invalidas.");
        }

        double areaTotalParedes = 0.0;

        for (ArestaDTO aresta : request.getArestas()) {
            double altura = aresta.getAltura() != null ? aresta.getAltura() : 0.0;
            double comprimento = aresta.getComprimento() != null ? aresta.getComprimento() : 0.0;
            double areaAberturas = aresta.getAreaAberturas() != null ? aresta.getAreaAberturas() : 0.0;

            double areaParede = (altura * comprimento) - areaAberturas;
            if (areaParede > 0) {
                areaTotalParedes += areaParede;
            }
        }

        double quantidadeExata = areaTotalParedes / areaTijolo;
        return (int) Math.ceil(quantidadeExata);
    }
}
