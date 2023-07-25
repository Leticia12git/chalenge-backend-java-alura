package com.projeto.alura.apijornada.service;

import com.projeto.alura.apijornada.dto.DepoimentoDTO;
import com.projeto.alura.apijornada.model.Depoimento;
import com.projeto.alura.apijornada.repository.DepoimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
     * @param
     * @return depoimento
     */


    public Depoimento criarDepoimento(DepoimentoDTO depoimentoDTO) {
        Depoimento depoimento = new Depoimento();
        depoimento.setNome(depoimentoDTO.getNome());
        depoimento.setFoto(depoimentoDTO.getFoto());
        depoimento.setDepoimento(depoimentoDTO.getDepoimento());
        depoimentoRepository.save(depoimento);
        return depoimento;
    }

    /**
     * metodo para exibir todos os depoimentos
     *
     * @return lista de depoimentos
     */

    public List<Depoimento> exibirDepoimentos() {
        return depoimentoRepository.findAll();

    }

    /**
     * metodo para atualizar um depoimento
     *
     * @param depoimento
     * @return depoimento
     */
    public Depoimento atualizarDepoimento( Depoimento depoimento) {
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

    /**
     *
     * @return
     */
    public List<Depoimento> obterDepoimentosRandomicos() {
        List<Depoimento> depoimentos = depoimentoRepository.findAll();
        if (depoimentos.isEmpty()) {
            return new ArrayList<>();
        }
        List<Depoimento> depoimentosRandomicos = new ArrayList<>();
        Random random = new Random();
        while (depoimentosRandomicos.size() < 3) {
            Depoimento depoimento = depoimentos.get(random.nextInt(depoimentos.size()));
            if (!depoimentosRandomicos.contains(depoimento)) {
                depoimentosRandomicos.add(depoimento);
            }
        }
        return depoimentosRandomicos;
    }
}
