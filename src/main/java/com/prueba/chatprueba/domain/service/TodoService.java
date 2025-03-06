package com.prueba.chatprueba.domain.service;

import com.prueba.chatprueba.domain.model.Todo;
import java.util.List;

public interface TodoService {
    List<Todo> findAll();
    Todo findById(Long id);
    Todo save(Todo todo);
    void deleteById(Long id);
}
