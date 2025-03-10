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

    public Todo handleUpdate(Long id, Todo updatedTodo) {
        // Primero, obtener la tarea existente.
        Todo existingTodo = todoService.findById(id);
        if(existingTodo == null) {
            // Puedes lanzar una excepción o manejar el error según tu lógica
            throw new RuntimeException("No se encontró el To-Do con id " + id);
        }
        // Actualiza los campos necesarios.
        existingTodo.setDescription(updatedTodo.getDescription());
        existingTodo.setCompleted(updatedTodo.isCompleted());
        
        // Guarda la tarea actualizada (con JPA, el método save actualiza si el ID ya existe)
        return todoService.save(existingTodo);
    }
    
}
