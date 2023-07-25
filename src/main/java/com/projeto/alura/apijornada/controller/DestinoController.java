package com.projeto.alura.apijornada.controller;

import com.projeto.alura.apijornada.dto.DestinoDTO;
import com.projeto.alura.apijornada.model.Destino;
import com.projeto.alura.apijornada.service.DestinoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @PostMapping
    public ResponseEntity criarDestino(@RequestBody @Valid DestinoDTO destinoDTO, UriComponentsBuilder uriBuilder) {
        Destino destino = destinoService.criarDestino(destinoDTO);
        URI uri = uriBuilder.path("/destino").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(destino);
    }


    @GetMapping
    public List<Destino> exibirDestino() {
        return destinoService.exibirDestinos();

    }


    @PutMapping(name = "/{id}")
    public Destino atualizarDestino(@RequestBody Destino destino) {
        return destinoService.atualizarDestino(destino);
    }


    @DeleteMapping(name = "/{id}")
    public void excluirDestino(Long id) {
        destinoService.excluirDestino(id);
    }
}
