package com.projeto.alura.apijornada.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepoimentoDTO {

    private String nome;
    private String foto;
    private String depoimento;

}
