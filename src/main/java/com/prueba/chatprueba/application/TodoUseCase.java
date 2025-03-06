package com.prueba.chatprueba.application;

import com.prueba.chatprueba.domain.model.Todo;
import com.prueba.chatprueba.domain.service.TodoService;
import java.util.List;

public class TodoUseCase {

    private final TodoService todoService;

    public TodoUseCase(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<Todo> handleGetAll() {
        return todoService.findAll();
    }

    public Todo handleGetById(Long id) {
        return todoService.findById(id);
    }

    public Todo handleCreate(Todo todo) {
        return todoService.save(todo);
    }

    public void handleDelete(Long id) {
        todoService.deleteById(id);
    }
}
