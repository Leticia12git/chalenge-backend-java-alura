package com.projeto.alura.apijornada.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 * Classe de configuracao
 */
@Configuration
public abstract class WebMvcConfigurer {

        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**")
                            .allowedOrigins("*") // Permitir todas as origens
                            .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir métodos específicos
                            .allowedHeaders("*") // Permitir todos os cabeçalhos
                            .allowCredentials(true); // Permitir o envio de cookies
                }
            };
        }

    public abstract void addCorsMappings(CorsRegistry registry);
}


