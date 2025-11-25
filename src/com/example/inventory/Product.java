package com.example.inventory;

public class Product {
    public int id;
    public String name;
    public int qty;
    public double price;
    public String category;

    public Product() {}

    public Product(int id, String name, int qty, double price, String category) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.category = category;
    }
}
