# Java Spring API 💻🌱

Este repositorio contiene un proyecto backend desarrollado con **Java** y **Spring Framework**, ideal para quienes están aprendiendo a construir APIs REST robustas y escalables. Incluye una estructura básica de controlador, servicio y repositorio, y está integrado con una base de datos **PostgreSQL** para la persistencia de datos.

## ⚙️ Tecnologías utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL

## 📂 Estructura del proyecto
🔸 `controller/` – Maneja las solicitudes HTTP y las rutas de la API.  
🔸 `service/` – Lógica de negocio y procesamiento de datos.  
🔸 `repository/` – Acceso a la base de datos mediante JPA.  
🔸 `model/` – Entidades que representan las tablas en PostgreSQL.  

## 🧪 Funcionalidades principales
- CRUD completo sobre entidades conectadas a PostgreSQL.
- Arquitectura MVC modular y limpia.
- Uso de anotaciones Spring como `@RestController`, `@Service`, `@Repository` y `@Entity`.

## 🛠️ Requisitos
- JDK 17 o superior  
- PostgreSQL instalado y configurado  
- IDE recomendado: **IntelliJ IDEA** o **VS Code** con extensiones para Spring  

## ▶️ Cómo ejecutar el proyecto
1. Clona este repositorio:
   ```bash
   git clone https://github.com/Doggenn/Java-Spring.git
   ```
2. Configura las credenciales de la base de datos en `application.properties`.
3. Ejecuta la aplicación con tu IDE o desde terminal:
   ```bash
   ./mvnw spring-boot:run
   ```

## 📝 Notas
Este proyecto está en desarrollo y sirve como base para futuros módulos o APIs más complejas. ¡Explora, modifica y aprende!

---

📌 [Repositorio en GitHub](https://github.com/Doggenn/Java-Spring)
