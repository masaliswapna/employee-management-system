# Employee Management System

## Overview
The **Employee Management System** is a Spring Boot application designed to manage employee records. This system allows users to perform CRUD (Create, Read, Update, Delete) operations on employee data, facilitating efficient management and retrieval of employee information.

## Features
- **Add Employee**: Create a new employee record with relevant details.
- **View Employees**: Retrieve a list of all employees.
- **Update Employee**: Modify the details of an existing employee.
- **Delete Employee**: Remove an employee record from the system.
- **Error Handling**: Custom exceptions for handling resource not found scenarios.

## Technologies Used
- **Java**: Programming language.
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For data access and manipulation.
- **MySQL**: Database to store employee records.
- **Postman**: For API testing.
- **Maven**: For project management and dependency management.

## Prerequisites
- JDK 11 or higher
- MySQL Server
- Maven

## Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/masaliswapna/employee-management-system.git
   cd employee-management-system
   ```

2. **Configure MySQL Database**
   - Create a database named `employee_management_db`.
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. **Build the Project**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

| Method | Endpoint                 | Description                         |
|--------|--------------------------|-------------------------------------|
| POST   | /api/employees           | Add a new employee                  |
| GET    | /api/employees           | Retrieve all employees              |
| GET    | /api/employees/{id}      | Retrieve an employee by ID          |
| PUT    | /api/employees/{id}      | Update an employee by ID            |
| DELETE | /api/employees/{id}      | Delete an employee by ID            |

## Testing with Postman
- Use Postman to test the API endpoints.
- Set the request type (GET, POST, PUT, DELETE) as per the API documentation.
- For the POST and PUT requests, ensure to send the appropriate JSON body.

### Example JSON Body for Adding an Employee:
```json
{
    "firstName": "Sushma",
    "lastName": "Patil",
    "email": "sushma.patil@gmail.com"
}
```

## Author
- **Swapna Masali**
- **GitHub**: [masaliswapna](https://github.com/masaliswapna)
