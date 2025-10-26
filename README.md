# Student Management REST API

A Spring Boot CRUD API for managing student data.

## Features
- CRUD operations for Student entity
- Validation and Exception handling
- MySQL integration

## Tech Stack
- Java
- Spring Boot
- MySQL
- Maven

## Endpoints
- `GET /api/students` → Get all students
- `POST /api/students` → Add new student
- `GET /api/students/{id}` → Get student by ID
- `PUT /api/students/{id}` → Update student by ID
- `DELETE /api/students/{id}` → Delete student by ID

## How to Run
1. Clone the repository
2. Run `mvn spring-boot:run` in project root
3. Test endpoints via Postman
