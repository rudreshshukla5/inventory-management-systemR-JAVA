# Inventory Management System – Review 2

## Overview
This project is a Java-based Inventory Management System developed to demonstrate
core Java concepts, OOP principles, JDBC connectivity, and basic data validation.

## Core Features
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
1. Compile Java files
2. Run `App.java`
3. SQLite database is created automatically

## Future Enhancements
- Java Swing GUI
- Update/Delete product
- Search functionality
- User authentication

## Author
B.Tech CSE (AIML) Student
