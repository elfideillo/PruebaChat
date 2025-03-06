package com.prueba.chatprueba.infrastructure.configuration;

import com.prueba.chatprueba.application.TodoUseCase;
import com.prueba.chatprueba.domain.service.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public TodoUseCase todoUseCase(TodoService todoService) {
        return new TodoUseCase(todoService);
    }
}
