# Etapa 1: Construcción de la aplicación
FROM maven:3.9-eclipse-temurin-20 AS builder
WORKDIR /app
# Copia el archivo pom.xml y descarga las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia el código fuente y compila el proyecto
COPY src ./src
RUN mvn package -DskipTests

# Etapa 2: Imagen final para ejecutar la aplicación
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copia el archivo JAR generado desde la etapa builder
COPY --from=builder /app/target/chatprueba-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

