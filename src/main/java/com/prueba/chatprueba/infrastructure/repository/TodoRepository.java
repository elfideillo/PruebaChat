package com.prueba.chatprueba.infrastructure.repository;

import com.prueba.chatprueba.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
