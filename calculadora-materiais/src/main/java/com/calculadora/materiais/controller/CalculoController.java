package com.calculadora.materiais.controller;

import com.calculadora.materiais.dto.CalculoConcretoRequest;
import com.calculadora.materiais.dto.CalculoTijolosRequest;
import com.calculadora.materiais.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/calculos")
public class CalculoController {

    @Autowired
    private CalculoService calculoService;

    @PostMapping("/concreto")
    public ResponseEntity<Map<String, Object>> calcularConcreto(@RequestBody CalculoConcretoRequest request) {
        Double volume = calculoService.calcularVolumeConcreto(request);
        Map<String, Object> response = new HashMap<>();
        response.put("volumeConcretoM3", volume);
        response.put("mensagem", "Calculo do volume de concreto realizado com sucesso.");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/tijolos")
    public ResponseEntity<Map<String, Object>> calcularTijolos(@RequestBody CalculoTijolosRequest request) {
        try {
            Integer quantidade = calculoService.calcularQuantidadeTijolos(request);
            Map<String, Object> response = new HashMap<>();
            response.put("quantidadeTijolos", quantidade);
            response.put("mensagem", "Calculo da quantidade de tijolos realizado com sucesso.");
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            Map<String, Object> error = new HashMap<>();
            error.put("erro", e.getMessage());
            return ResponseEntity.badRequest().body(error);
        }
    }
}
