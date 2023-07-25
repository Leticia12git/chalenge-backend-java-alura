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
@RequestMapping(value = "/destinos-home")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    /**
     *
     * @return
     */
    @GetMapping
    public List<Destino> listarDestinos(){
        return destinoService.listarDestinos();
    }

    /**
     *
     * @param destinoDTO
     * @param uriBuilder
     * @return
     */

    @PostMapping
    public ResponseEntity criarDestino(@RequestBody @Valid DestinoDTO destinoDTO, UriComponentsBuilder uriBuilder) {
        Destino destino = destinoService.criarDestino(destinoDTO);
        URI uri = uriBuilder.path("/destino").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(destino);
    }

    /**
     *
     * @param destino
     * @return
     */


    @PutMapping(name = "/{id}")
    public Destino atualizarDestino(@RequestBody Destino destino) {
        return destinoService.atualizarDestino(destino);
    }

    /**
     *
     * @param id
     */

    @DeleteMapping(name = "/{id}")
    public void excluirDestino(Long id) {
        destinoService.excluirDestino(id);
    }
}
