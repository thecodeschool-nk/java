package com.thecodeschool.jdbc.model;

public class Product {
    private long productId;
    private String productCode;
    private String name;
    private long quantity;
    private double price;

    public Product(long productId, String productCode, String name, long quantity, double price) {
        this.productId = productId;
        this.productCode = productCode;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
