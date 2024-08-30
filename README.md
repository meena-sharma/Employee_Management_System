# Employee_Management_System
# Description:
The Employee Management System is a Spring Boot-based application that facilitates the management of employee and department data. It provides functionalities for creating, reading, updating, and deleting both departments and employees, while managing their relationships efficiently.

# Key Points:
CRUD Operations: Implements Create, Read, Update, and Delete operations for departments and employees via RESTful endpoints.

DTO Utilization: Uses Data Transfer Objects (DTOs) to manage data transfer between application layers.

Global Exception Handling: Provides centralized error handling to manage and return consistent error responses.

RESTful API Endpoints: Exposes RESTful endpoints for managing department and employee data.

ORM Integration: Utilizes Spring Data JPA and Hibernate for database interactions and entity management.

SQL Initialization: Sets up initial data and schema through SQL scripts to prepare the database.

# Project Structure:
employeemanagementsystem├── src│├── main││├── java│││└── com.example.employeemanagementsystem│││├── EmployeemanagementsystemApplication.java││ │├── config│   │   ││   └── JpaAuditingConfig.java│   │   │├── controller│   │   │       │   ├── DepartmentController.java│   │   │       │   └── EmployeeController.java│   │   │       ├── dto│   │   │       │   ├── DepartmentDTO.java│   │   │       │   └── EmployeeDTO.java│  │   │       ├── model│   │   │       │   ├── Department.java│   │   │       │   └── Employee.java│   │   │       ├── projection│   │   │       │   ├── DepartmentProjection.java
│   │   │       │   └── EmployeeProjection.java│   │   │       ├── repository│   │   │       │   ├── DepartmentRepository.java│   │   │       │   └── EmployeeRepository.java│   │   │       ├── service│   │   │       │   ├── DepartmentService.java│   │   │       │   └── EmployeeService.java│   │   │       └── GlobalExceptionHandler.java│   ├── resources│   │   ├── application.properties│   │   ├── data.sql│   │   └── schema.sql│   └── test│       └── java│           └── com.example.employeemanagementsystem├── target│   ├── generated-sources/annotations│   └── generated-test-sources/test-annotations├── .mvn├── .vscode├── .gitignore├── HELP.md├── mvnw├── mvnw.cmd└── pom.xml


# Technologies Used:

* Spring Boot 3
* Spring Data JPA
* Hibernate
* Maven
* Jackson
* H2 Database

# To Run:
Clone the repository:

git clone https://github.com/meena-sharma/Employee_Management_System
cd employeemanagementsystem

Open the project in Visual Studio Code.

2.Run the project:

Use the built-in Spring Boot features to run the application directly from the IDE.

3.Access the application:

The REST API will be available at http://localhost:8081/. The home page can be accessed at http://localhost:8081/index.html.

# Screenshots:
![h2 console dept](https://github.com/user-attachments/assets/0324884d-42c4-495c-a084-4b32397fc694)
![employee console](https://github.com/user-attachments/assets/79fbbcee-b2aa-495b-afa5-ccd5942d5f16)

Operations:
Create:
![dept add](https://github.com/user-attachments/assets/7b043e9f-8961-41ba-bbc5-656f053301e6)
![employee post ](https://github.com/user-attachments/assets/5c8b1200-f3f5-4e46-aba6-52540e381f0b)

Read:
![get employees](https://github.com/user-attachments/assets/4ea78998-0657-463a-a02f-24d7b602ea4d)
![emp get 2](https://github.com/user-attachments/assets/02570db1-9c74-4292-8b1b-e6399c6a1e9e)

Delete:
![delete employe](https://github.com/user-attachments/assets/c002f41f-6cb6-492e-a429-959b6e7ee811)
![employee delete2](https://github.com/user-attachments/assets/af80ad11-b7b9-4160-a112-220d0e616edb)




