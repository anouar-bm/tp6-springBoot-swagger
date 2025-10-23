# Student Management System

## Project Overview

This is a student management system, a Spring Boot application that provides RESTful APIs for managing students. It uses Spring Web for the REST controllers, Spring Data JPA for database interaction, and a MySQL database for persistence. The project also includes `springdoc-openapi` for generating API documentation.

## Building and Running

### Prerequisites

- Java 21
- Maven

### Running the application

To run the application, use the following Maven command:

```bash
./mvnw spring-boot:run
```

The application will start on the default port (usually 8080).

### Building the application

To build the application and create a JAR file, use the following Maven command:

```bash
./mvnw clean install
```

### Running tests

To run the tests, use the following Maven command:

```bash
./mvnw test
```

## API Endpoints

The main API endpoints are under the `/students` path.

- `POST /save`: Creates a new student.
- `DELETE /delete/{id}`: Deletes a student by ID.
- `GET /all`: Retrieves all students.
- `GET /byYear`: Retrieves the number of students grouped by their birth year.
- `GET /count`: Retrieves the total number of students.

You can view the full API documentation with Swagger UI by navigating to `/swagger-ui.html` in your browser when the application is running.

## Development Conventions

- The project follows the standard Spring Boot project structure.
- It uses Spring Data JPA repositories for data access.
- Business logic is encapsulated in service classes.
- REST controllers handle HTTP requests and responses.

## Video Demo

[Link to Video Demo]()
This demo shows how to run the tests and how to use the Swagger UI to interact with the API.
