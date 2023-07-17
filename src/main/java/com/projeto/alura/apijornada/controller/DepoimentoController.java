package com.projeto.alura.apijornada.controller;

import com.projeto.alura.apijornada.model.Depoimento;
import com.projeto.alura.apijornada.repository.DepoimentoRepository;
import com.projeto.alura.apijornada.service.DepoimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * Classe de endpoints de depoimento s
 */

@RestController
@RequestMapping(name = "/depoimentos")
public class DepoimentoController {
    @Autowired
    private DepoimentoService depoimentoService;

    /**
     * Endpoint para criar um depoimento
     *
     * @param depoimento
     * @return depoimento
     */


    @PostMapping
    public Depoimento criarDepoimento(@RequestBody Depoimento depoimento) {
        return depoimentoService.criarDepoimento(depoimento);
    }

    /**
     * Endpoint para listar todos os depoimentos
     *
     * @return List<Depoimento>
     */
    @GetMapping
    public List<Depoimento> exibirDepoimentos() {
        Random random = new Random();
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
        Depoimento depoimentoNovo = new Depoimento();
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
