# ChatPrueba

Este proyecto es una aplicación de demostración desarrollada con Spring Boot.

## Funcionalidades

- **API REST para To-Do List:**  
  Permite gestionar tareas (crear, leer, actualizar y eliminar) mediante endpoints REST.

- **Chat en tiempo real con WebSockets:**  
  Implementa un chat en tiempo real usando WebSockets y STOMP.

- **Arquitectura Hexagonal:**  
  Separa la lógica de negocio (dominio), los casos de uso (aplicación) y los adaptadores (infraestructura) para facilitar el mantenimiento y la escalabilidad del código.

- **Pruebas con JUnit y Mockito:**  
  Incluye pruebas unitarias y de integración para asegurar la calidad y estabilidad del código.

- **Empaquetado con Docker:**  
  La aplicación se empaqueta en una imagen Docker, facilitando su despliegue en diferentes entornos.

## Tecnologías Utilizadas

- **Java  20**  
- **Spring Boot 3.4.3**
- **Spring Web**
- **Spring Boot Starter WebSocket**
- **Spring Data JPA**
- **H2 Database** (para desarrollo y pruebas)
- **JUnit 5 y Mockito** (para testing)
- **Docker**

## Estructura del Proyecto

El proyecto sigue la arquitectura hexagonal, organizada en los siguientes paquetes:

- **Domain:**  
  Contiene las entidades y la lógica de negocio (por ejemplo, `Todo` y `TodoService`).

- **Application:**  
  Define los casos de uso  

- **Infrastructure:**  
  Incluye:
  - **Controllers:** Exponen los endpoints REST y WebSocket (por ejemplo, `TodoController` y `ChatController`).
  - **Repositories:** Implementaciones de persistencia usando Spring Data JPA.
  - **Configurations:** Configuraciones específicas, como `WebSocketConfig` y `UseCaseConfig`.

## Requisitos Previos

- Java (JDK  20 )
- Maven
- Docker Desktop

## Cómo Ejecutar el Proyecto

### Ejecución Local con Maven

1. **Compilar y empaquetar el proyecto:**
   
   mvn clean package -DskipTests

2. **Ejecutar la aplicación:**
   mvn spring-boot:run
3. **Probar la API REST:**
   Accede a http://localhost:8080/api/todos
4. **Ejecución Docker:**
   docker build -t chatprueba-app .
5. **Ejecutar el contenedor:**
docker run -p 8080:8080 chatprueba-app
6. **Acceder a la aplicación:**
   Abre http://localhost:8080 en tu navegador.
7. Para ejecutar las pruebas unitarias e integración, usa el siguiente comando:
   mvn test

## Autor
Carolina Zurita Herbas
