# Inventory Management System JAVAr

Simple Java app demonstrating CRUD on a `products` table using SQLite and JDBC.

## Files
- `DBConnection.java` — opens `inventory.db`
- `Product.java` — model (simple public fields)
- `ProductDao.java` — creates table, add, list
- `App.java` — adds a sample product and prints list
- `.gitignore`

## How to run (if reviewer wants to run locally)
1. Download project and add `sqlite-jdbc.jar` to project or classpath.
2. Compile:
3. Run:
- On Windows:
  ```
  java -cp bin;sqlite-jdbc.jar com.example.inventory.App
  ```
- On Mac/Linux:
  ```
  java -cp bin:sqlite-jdbc.jar com.example.inventory.App
  ```
