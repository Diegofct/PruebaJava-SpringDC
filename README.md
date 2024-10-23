# Proyecto de Gestión de Estudiantes - Institución Educativa "El Futuro del Saber"

Este proyecto es una aplicación desarrollada con **Java** y **Spring Boot** para la gestión de información básica de los estudiantes de la Institución Educativa "El Futuro del Saber". La aplicación permite gestionar los datos de los estudiantes, tales como su tipo de documento, nombres, apellidos, fecha de nacimiento, edad, grado actual, email, teléfono y celular.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- JPA (Java Persistence API)
- MySQL (Driver y Base de Datos)
- Lombok
- Spring DevTools
- Validation (para la validación de datos)
- Arquitectura Hexagonal y Vertical Slicing

## Funcionalidades principales

- **Crear, Leer, Actualizar y Eliminar (CRUD)** información de estudiantes.
- Gestión de tipos de documento de identidad (Cédula, Tarjeta de Identidad, Registro Civil).
- Gestión de grados escolares (desde 1° hasta 11°).
- Validación de datos de entrada mediante anotaciones de Spring.

## Estructura del proyecto

El proyecto está estructurado siguiendo las mejores prácticas recomendadas por **Spring Boot**. A continuación, algunos de los paquetes y clases más relevantes:

- `src/main/resources/`: Contiene recursos importantes para la aplicación:
  - `application.properties`: Configuración de la conexión a la base de datos.
  - `comandoDML.sql`: Script DML con los registros de prueba para las tablas `Estudiante`, `TipoDocumento` y `Grado` y las consultas requeridas en el ejercicio.
  - `EstudianteMER.png`: Imagen del Modelo Entidad-Relación (MER) de la base de datos.
