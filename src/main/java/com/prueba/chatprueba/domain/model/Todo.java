package com.prueba.chatprueba.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private boolean completed;

    protected Todo() {}  // Constructor requerido por JPA

    public Todo(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
