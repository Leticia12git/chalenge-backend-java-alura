package com.projeto.alura.apijornada.controller;

import com.projeto.alura.apijornada.dto.DepoimentoDTO;
import com.projeto.alura.apijornada.model.Depoimento;
import com.projeto.alura.apijornada.service.DepoimentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Classe de endpoints de depoimento s
 */

@RestController
@RequestMapping("/depoimentos")
public class DepoimentoController {
    @Autowired
    private DepoimentoService depoimentoService;

    /**
     * Endpoint para criar um depoimento
     *
     * @param
     * @return depoimento
     */


    @PostMapping
    public ResponseEntity criarDepoimento(@RequestBody @Valid DepoimentoDTO depoimentoDTO, UriComponentsBuilder uriBuilder) {
        Depoimento depoimento = depoimentoService.criarDepoimento(depoimentoDTO);
        URI uri = uriBuilder.path("/depoimento").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(depoimento);
    }

    /**
     * Endpoint para listar todos os depoimentos
     *
     * @return List<Depoimento>
     */
    @GetMapping
    public List<Depoimento> exibirDepoimentos() {
        return depoimentoService.exibirDepoimentos();

    }

    /**
     * Endpoint para atualizar um depoimento
     *
     * @param depoimento
     * @return depoimento
     */
    @PutMapping(name = "/{id}")
    public Depoimento atualizarDepoimento(@RequestBody Depoimento depoimento) {
        return depoimentoService.atualizarDepoimento(depoimento);
    }

    /**
     * Endpoint para deletar um depoimento
     *
     * @param id
     */
    @DeleteMapping(name = "/{id}")
    public void deletarDepoimento(Long id) {
        depoimentoService.deletarDepoimento(id);
    }
}
