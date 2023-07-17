package com.projeto.alura.apijornada.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidade relacionada a depoimento
 */

@Entity
@Data
@Table(name = "depoimentos")
public class Depoimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String foto;
    private String depoimento;

}
