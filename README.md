# Java CRUD Application — CRUD_IT_73586

## Overview

This project is a simple Java CRUD (Create, Read, Update, Delete) web application developed as part of an assignment to practise Java, Git, GitHub, and collaborative software development.

The application provides a customer management interface where users can add customers, view customer records, update customer information, and delete customers.

## Technologies Used

- **Java 17** — Programming language
- **Spring Boot** — Application framework
- **Spring Web MVC** — Handling HTTP requests and REST endpoints
- **Spring Data JPA** — Database operations and persistence
- **H2 Database** — Lightweight database
- **Maven** — Dependency management and build automation
- **Git and GitHub** — Version control and collaboration
- **HTML, CSS, and JavaScript** — User interface

## Features

- Create new customer records
- Display all customers
- View an individual customer by ID through the REST API
- Edit existing customer information
- Delete customer records
- Store customer data in an H2 database
- Provide REST API endpoints for customer operations

## Project Structure

```text
crud-it-73586/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/crud_it_73586/
│   │   │       ├── CrudIt73586Application.java
│   │   │       ├── Customer.java
│   │   │       ├── CustomerController.java
│   │   │       └── CustomerRepository.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Requirements

- Java Development Kit (JDK) 17 or a compatible version
- Git
- A web browser

The included Maven Wrapper downloads and uses the required Maven version.

## How to Run the Application

### Open the application

Once Spring Boot has started, open the following address in your browser:

http://localhost:8080

The application runs locally while the Spring Boot process is active.

## REST API Endpoints

The base URL for customer operations is `/api/customers`.

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/customers` | Retrieve all customers |
| GET | `/api/customers/{id}` | Retrieve a customer by ID |
| POST | `/api/customers` | Create a customer |
| PUT | `/api/customers/{id}` | Update a customer |
| DELETE | `/api/customers/{id}` | Delete a customer |

### Example: Create a Customer

Send a POST request to `/api/customers` with the following JSON body:

```json
{
  "name": "Alex Smith",
  "email": "alex@example.com"
}
```

## Database

The application uses H2 Database for storing customer records. The database configuration is defined in `src/main/resources/application.properties`.

Customer IDs are generated automatically by the database.

## Learning Objectives

This project provides practical experience with:

- Developing a Java application using Spring Boot
- Implementing CRUD functionality
- Working with REST APIs and databases
- Managing project dependencies with Maven
- Using Git for version control
- Hosting source code on GitHub
- Preparing a project for collaboration with other developers
