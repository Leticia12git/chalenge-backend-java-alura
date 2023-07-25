package com.projeto.alura.apijornada.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DepoimentoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void criarDepoimento() {
        String requestBody = "{\"conteudo\": \"Este é um depoimento de teste.\"}";

        mockMvc.perform(post("/depoimentos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isCreated());
    }

    @Test
    void exibirDepoimentos() {
        mockMvc.perform(get("/depoimentos"))
                .andExpect(status().isOk());
    }

    @Test
    void atualizarDepoimento() {
        Long id = 1L;
        String requestBody = "{\"conteudo\": \"Este é um depoimento de teste atualizado.\"}";

        mockMvc.perform(atualizarDepoimento("/depoimentos/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk());
    }

    @Test
    void deletarDepoimento() {
    }
}