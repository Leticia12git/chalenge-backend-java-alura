package com.projeto.alura.apijornada.repository;

import com.projeto.alura.apijornada.model.Depoimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio relacionando a depoimento
 */
@Repository
public interface DepoimentoRepository extends JpaRepository<Depoimento, Long> {
}
