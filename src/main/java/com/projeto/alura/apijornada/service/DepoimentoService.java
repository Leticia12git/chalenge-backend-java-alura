package com.projeto.alura.apijornada.service;

import com.projeto.alura.apijornada.model.Depoimento;
import com.projeto.alura.apijornada.repository.DepoimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Random;

/**
 * Classe de serviços relacionada a depoimentos
 *
 * @author Leticia Lima
 */
@Service
public class DepoimentoService {

    @Autowired
    private DepoimentoRepository depoimentoRepository;

    /**
     * metodo para criar um depoimento
     *
     * @param depoimento
     * @return depoimento
     */

    public Depoimento criarDepoimento(Depoimento depoimento) {
        return depoimentoRepository.save(depoimento);

    }

    /**
     * metodo para exibir todos os depoimentos
     *
     * @return lista de depoimentos
     */
    @GetMapping
    public List<Depoimento> exibirDepoimentos() {
        //Random random = new Random();
        return depoimentoRepository.findAll();

    }

    /**
     * metodo para atualizar um depoimento
     *
     * @param depoimento
     * @return depoimento
     */
    public Depoimento atualizarDepoimento(@RequestBody Depoimento depoimento) {
        return depoimentoRepository.save(depoimento);
    }


    /**
     * metodo para deletar um depoimento
     *
     * @param id
     */
    public void deletarDepoimento(Long id) {
        depoimentoRepository.deleteById(id);
    }
}
