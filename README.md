# Healthcare and Safety Management System

A Java application that manages patient appointments and emergency priority cases, using JDBC to connect to a MySQL database.

![Java](https://img.shields.io/badge/Java-JDBC-orange) ![MySQL](https://img.shields.io/badge/Database-MySQL-blue)

## Features
- Book, view, update, and cancel patient appointments
- Handle emergency cases with priority ordering so urgent patients are seen first
- Search records by patient ID or name
- Data stored in MySQL with related tables

## Tech Stack
| Area | Tools |
|------|-------|
| Language | Java |
| Database | MySQL |
| Connectivity | JDBC (MySQL Connector/J) |
| Interface | Console |

## Project Structure
```
Healthcare-Appointment-Emergency-Priority-Management-System/
├── src/
│   ├── Main.java            # Entry point
│   ├── DBConnection.java    # JDBC connection setup
│   └── ...                  # Other classes
├── database/
│   └── schema.sql           # Table creation script
└── README.md
```

## Database Schema
| Table | Columns |
|-------|---------|
| patients | patient_id, name, age, contact |
| appointments | appointment_id, patient_id, date, priority, status |

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- MySQL Server
- MySQL Connector/J (JDBC driver)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/kavishri-23/Healthcare-Appointment-Emergency-Priority-Management-System.git
   cd Healthcare-Appointment-Emergency-Priority-Management-System
   ```
2. Create the database and tables:
   ```sql
   CREATE DATABASE healthcare_db;
   USE healthcare_db;
   -- then run the contents of database/schema.sql
   ```
3. Set your credentials in `DBConnection.java`:
   ```java
   String url = "jdbc:mysql://localhost:3306/healthcare_db";
   String user = "your_username";
   String password = "your_password";
   ```
   Never commit your real password to GitHub.
4. Compile and run (Linux/macOS):
   ```bash
   javac -cp ".:path/to/mysql-connector.jar" src/*.java
   java -cp ".:path/to/mysql-connector.jar:src" Main
   ```
   On Windows, use `;` instead of `:` in the classpath.

## Usage
1. Run the application.
2. Choose an option from the menu: add, view, update, delete, or search.
3. All changes are saved to the MySQL database.

## What I Learned
- Connecting a Java application to MySQL using JDBC
- Writing parameterized queries with `PreparedStatement`
- Designing relational tables and performing CRUD operations

## Future Improvements
- Role-based login for staff and admin
- REST API layer using Spring Boot
- Appointment reminders

## Author
**Kavishri Senguttuvan**
[GitHub](https://github.com/kavishri-23) · [LinkedIn](https://www.linkedin.com/in/kavishrisenguttuvan)
