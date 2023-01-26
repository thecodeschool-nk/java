package com.thecodeschool.jdbc.dao;

import com.thecodeschool.jdbc.connection.DBConnection;
import com.thecodeschool.jdbc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<Product> getAllProducts() {
        Connection connection = this.dbConnection.connect();
        Statement stmt = null;
        ResultSet rs = null;
        List<Product> productList = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getLong(4),
                        rs.getDouble(5)
                );
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return productList;
    }

    public int updateProductPrice(int productId, double newPrice) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("UPDATE products SET price=? WHERE product_id=?");
            stmt.setDouble(1, newPrice);
            stmt.setInt(2, productId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }

    public int updateProductName(int productId, String name) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("UPDATE products SET name=? WHERE product_id=?");
            stmt.setString(1, name);
            stmt.setInt(2, productId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }

    public int updateProductQuantity(int productId, int quantity) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("UPDATE products SET quantity=? WHERE product_id=?");
            stmt.setInt(1, quantity);
            stmt.setInt(2, productId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }

    public int updateProductCode(int productId, String code) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("UPDATE products SET product_code=? WHERE product_id=?");
            stmt.setString(1, code);
            stmt.setInt(2, productId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }

    public int deleteProduct(int productId) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("DELETE FROM products WHERE product_id=?");
            stmt.setInt(1, productId);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }

    public int addProduct(int productId, String code, String name, int quantity, double price) {
        Connection connection = this.dbConnection.connect();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO products (product_id, product_code, name, quantity, price) VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, productId);
            stmt.setString(2, code);
            stmt.setString(3, name);
            stmt.setInt(4, quantity);
            stmt.setDouble(5, price);
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.dbConnection.close();
        }
        return 0;
    }
}
