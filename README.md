# Inventory Management System 
polish readme fo review 2

## Overview
This project is a Java-based Inventory Management System developed to demonstrate
core Java concepts, OOP principles, JDBC connectivity, and basic data validation.

## Core Features
- Basic input validation to prevent invalid data
- Exception handling to avoid application crashes
- Add product to inventory
- View all products
- SQLite database integration using JDBC
- Modular code structure (Model, DAO, Utility)

## Error Handling & Validation
- Try-catch blocks used to prevent application crashes
- Validation for invalid product inputs (empty name, negative quantity, price)

## Project Structure
- `Product.java` – Model class
- `ProductDao.java` – Database operations
- `DBConnection.java` – JDBC connection handling
- `App.java` – Application entry point

## Database Schema
Table: `products`
- id (Primary Key)
- name
- qty
- price
- category
  
## How to Run
1. Ensure Java is installed on the system
2. Compile all Java files
3. Run `App.java`
4. SQLite database (`inventory.db`) will be created automatically
   
## Future Enhancements
- Java Swing GUI
- Update/Delete product
- Search functionality
- User authentication
  
## Objective
The objective of this project is to design and implement a basic inventory
management system using Java, applying OOP principles, JDBC for database
connectivity, and structured code organization.

- Smooth integration between application logic and database layer using JDBC

## Author
B.Tech CSE (AIML) Student
