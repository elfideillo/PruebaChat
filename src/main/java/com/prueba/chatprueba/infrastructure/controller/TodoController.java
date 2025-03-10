package com.prueba.chatprueba.infrastructure.controller;

import com.prueba.chatprueba.application.TodoUseCase;
import com.prueba.chatprueba.domain.model.Todo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoUseCase todoUseCase;

    public TodoController(TodoUseCase todoUseCase) {
        this.todoUseCase = todoUseCase;
    }

    @GetMapping
    public List<Todo> listAll() {
        return todoUseCase.handleGetAll();
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable Long id) {
        return todoUseCase.handleGetById(id);
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoUseCase.handleCreate(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        todoUseCase.handleDelete(id);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo updatedTodo) {
        return todoUseCase.handleUpdate(id, updatedTodo);
    }
}
