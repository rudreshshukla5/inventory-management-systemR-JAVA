package com.example.inventory;

public class App {
    public static void main(String[] args) throws Exception {
        ProductDao dao = new ProductDao();
        dao.add(new Product(0, "Sample Item", 10, 99.99, "General"));
        System.out.println("Added sample item. Current list:");
        dao.listAll().forEach(p ->
            System.out.println(p.id + " | " + p.name + " | " + p.qty + " | " + p.price)
        );
    }
}
