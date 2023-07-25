package com.projeto.alura.apijornada.service;

import com.projeto.alura.apijornada.dto.DepoimentoDTO;
import com.projeto.alura.apijornada.dto.DestinoDTO;
import com.projeto.alura.apijornada.model.Destino;
import com.projeto.alura.apijornada.repository.DestinoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;


    public List<DestinoDTO> buscarDestinoPorNome(DestinoDTO destinoDTO) throws Exception {
        try {
            var destinos = destinoRepository.findAll();

        } catch (Exception e){
            throw new Exception("Nenhum destino foi encontrado !");
        }
        return destinos;
    }

    public DestinoDTO criarDestino(@Valid DepoimentoDTO destinoDTO) {
        DestinoDTO destino = new DestinoDTO();
        destino.getFoto();
        destinoRepository.save(destino);
        return destinoDTO;
    }


    public List<Destino> exibirDestinos() {
        return destinoRepository.findAll();

    }

    public Destino atualizarDestino( Destino destino) {
        return destinoRepository.save(destino);
    }


    public void deletarDestino(Long id) {
        destinoRepository.deleteById(id);
    }
}
