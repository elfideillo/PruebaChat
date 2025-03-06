package com.prueba.chatprueba.infrastructure.repository;

import com.prueba.chatprueba.domain.model.Todo;
import com.prueba.chatprueba.domain.service.TodoService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}
