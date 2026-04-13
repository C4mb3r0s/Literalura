# Literalura

Command-line book catalog application that integrates with the Gutendex API (Project Gutenberg index). Searches, stores, and queries books and authors with an interactive text menu backed by a PostgreSQL database.

---

## Technologies

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 3.4.1 |
| Spring Data JPA | — |
| PostgreSQL | — |
| Jackson Databind | 2.16.0 |
| Java HttpClient (built-in) | — |

---

## Project Structure

```
src/main/
├── java/com/Literalura/
│   ├── LiteraluraApplication.java
│   ├── principal/
│   │   └── Principal.java
│   ├── model/
│   │   ├── Libro.java
│   │   ├── Autor.java
│   │   ├── Idiomas.java
│   │   ├── DatosLibros.java
│   │   ├── DatosAutores.java
│   │   └── DatosResultados.java
│   ├── repository/
│   │   ├── LibroRepository.java
│   │   └── AutorRepository.java
│   └── service/
│       ├── LibroService.java
│       ├── AutorService.java
│       ├── ConsumoAPI.java
│       ├── ConvierteDatos.java
│       └── IConvierteDatos.java
└── resources/
    └── application.properties
```

---

## Features

Interactive CLI menu with the following options:

1. Search a book by title (fetches from Gutendex API and saves locally)
2. List all registered books
3. List all registered authors
4. Find authors alive in a given year
5. List books by language (es / en / fr / pt)
6. Download statistics (average, max, min)
7. Top 10 most downloaded books
8. Search an author by name

---

## Getting Started

### Prerequisites

- Java 17
- PostgreSQL running locally
- Maven

### Configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=your_user
spring.datasource.password=your_password
```

### Run

```bash
./mvnw spring-boot:run
```

The interactive menu starts automatically on boot.

---

## Author

**C4mb3r0s** — [github.com/C4mb3r0s](https://github.com/C4mb3r0s)
