package com.prueba.chatprueba.domain.service;

import com.prueba.chatprueba.domain.model.Todo;
import com.prueba.chatprueba.infrastructure.repository.TodoRepository;
import com.prueba.chatprueba.infrastructure.repository.TodoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TodoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    // Inyecta los mocks en la implementación del servicio
    @InjectMocks
    private TodoServiceImpl todoService;

    @BeforeEach
    public void setUp() {
        // Inicializa los mocks de Mockito
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll() {
        // Prepara datos de prueba
        Todo todo1 = new Todo("Comprar pancito", false);
        Todo todo2 = new Todo("Pasear al Mojis", true);

        // Configura el comportamiento del mock
        when(todoRepository.findAll()).thenReturn(Arrays.asList(todo1, todo2));

        // Ejecuta el método a probar
        List<Todo> todos = todoService.findAll();

        // Verifica el resultado
        assertEquals(2, todos.size());
        verify(todoRepository, times(1)).findAll();
    }
}
