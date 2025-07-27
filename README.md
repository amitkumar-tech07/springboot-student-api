#  Spring Boot Student REST API

<br>
A simple Spring Boot-based RESTful API for managing students.
<br>
This project demonstrates basic CRUD operations (Create, Read, Update, Delete) without a database, using in-memory data for learning purposes.


# Features

Get all students
Get student by ID
Add new student
Update student by ID
Delete student by ID


# Getting Started

# Prerequisites

- Java 17+ (or 11+ if configured)
- Maven
- Spring Boot
- Git (to clone repo)
- Postman or cURL (to test endpoints)



# Clone the Repository


git clone https://github.com/amitkumar-tech07/springboot-student-api.git
<br>
cd springboot-student-api



 #API Endpoints
 
| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get student by ID    |
| POST   | `/students`      | Add a new student    |
| PUT    | `/students/{id}` | Update student by ID |
| DELETE | `/students/{id}` | Delete student by ID |


# Example JSON (POST / PUT)
{
  "id": 3,
  "name": "Aman",
  "email": "aman@example.com"
}


# Technologies Used

Java
Spring Boot
Maven
REST APIs
Postman (for testing)

# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.

# Author
Amit Kumar – @amitkumar-tech07
