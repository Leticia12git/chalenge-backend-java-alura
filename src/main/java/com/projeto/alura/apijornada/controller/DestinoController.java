package com.projeto.alura.apijornada.controller;

import com.projeto.alura.apijornada.dto.DepoimentoDTO;
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
@RequestMapping(name = "/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @PostMapping
    public ResponseEntity criarDestino(@RequestBody @Valid DepoimentoDTO destinoDTO, UriComponentsBuilder uriBuilder) {
        DestinoDTO destino = destinoService.criarDestino(destinoDTO);
        URI uri = uriBuilder.path("/depoimento/{id}").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(destino);
    }


    @GetMapping
    public List<Destino> exibirDepoimentos() {
        return destinoService.exibirDestinos();

    }


    @PutMapping(name = "/{id}")
    public Destino atualizarDepoimento(@RequestBody Destino destino) {
        return destinoService.atualizarDestino(destino);
    }


    @DeleteMapping(name = "/{id}")
    public void deletarDepoimento(Long id) {
        destinoService.deletarDestino(id);
    }
}
