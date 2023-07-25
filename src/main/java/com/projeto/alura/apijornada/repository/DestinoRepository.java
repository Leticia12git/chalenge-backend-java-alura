package com.projeto.alura.apijornada.repository;

import com.projeto.alura.apijornada.model.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}
