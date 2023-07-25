package com.projeto.alura.apijornada.service;

import com.projeto.alura.apijornada.dto.DestinoDTO;
import com.projeto.alura.apijornada.model.Destino;
import com.projeto.alura.apijornada.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;


    public void buscarDestinoPorNome(DestinoDTO destinoDTO) throws Exception {
        try {
            var destinos = destinoRepository.findAll();

        } catch (Exception e){
            throw new Exception("Nenhum destino foi encontrado !");
        }
    }

    public Destino criarDestino(DestinoDTO destinoDTO) {
        Destino destino = new Destino();
        destino.setFoto(destinoDTO.getFoto());
        destino.setNome(destinoDTO.getNome());
        destino.setPreco(destinoDTO.getPreco());
        destinoRepository.save(destino);
        return destino;

    }


    public List<Destino> exibirDestinos() {
        return destinoRepository.findAll();

    }

    public Destino atualizarDestino( Destino destino) {
        return destinoRepository.save(destino);
    }


    public void excluirDestino(Long id) {
        destinoRepository.deleteById(id);
    }
}
