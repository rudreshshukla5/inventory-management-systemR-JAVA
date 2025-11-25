package com.example.inventory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public ProductDao() {
        // create table if not exists
        try (Connection c = DBConnection.getConnection(); Statement s = c.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS products(" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "name TEXT, qty INTEGER, price REAL, category TEXT)";
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add(Product p) throws SQLException {
        String sql = "INSERT INTO products(name, qty, price, category) VALUES(?,?,?,?)";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, p.name);
            ps.setInt(2, p.qty);
            ps.setDouble(3, p.price);
            ps.setString(4, p.category);
            ps.executeUpdate();
        }
    }

    public List<Product> listAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection c = DBConnection.getConnection();
             Statement s = c.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("qty"),
                    rs.getDouble("price"),
                    rs.getString("category")
                ));
            }
        }
        return list;
    }
}
