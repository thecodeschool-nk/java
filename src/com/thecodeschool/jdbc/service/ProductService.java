package com.thecodeschool.jdbc.service;

import com.thecodeschool.jdbc.connection.DBConnection;
import com.thecodeschool.jdbc.dao.ProductDao;
import com.thecodeschool.jdbc.model.Product;
import com.thecodeschool.jdbc.util.UniqueIdGenerator;

import java.util.List;

public class ProductService {
    private ProductDao productDao;
    private UniqueIdGenerator uniqueIdGenerator;

    public ProductService() {
        this.productDao = new ProductDao(new DBConnection());
        this.uniqueIdGenerator = new UniqueIdGenerator();
    }

    public void displayProducts() {
        List<Product> productList = productDao.getAllProducts();

        productList.stream()
                .forEach(System.out::println);
    }

    public int updateProductPrice(int productId, double price) {
        return productDao.updateProductPrice(productId, price);
    }
    public int updateProductName(int productId, String name) {
        return productDao.updateProductName(productId, name);
    }

    public int updateProductQuantity(int productId, int quantity) {
        return productDao.updateProductQuantity(productId, quantity);
    }

    public int updateProductCode(int productId, String code) {
        return productDao.updateProductCode(productId, code);
    }

    public int deleteProduct(int productId) {
        return productDao.deleteProduct(productId);
    }

    public int addProduct(String code, String name, int quantity, double price) {
        int productId = uniqueIdGenerator.getUniqueId();
        return productDao.addProduct(productId, code, name, quantity, price);
    }

}
