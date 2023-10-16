package com.thecodeschool.hibrernate.service;

import com.thecodeschool.hibrernate.connection.HibernateUtil;
import com.thecodeschool.hibrernate.dao.ProductDao;
import com.thecodeschool.hibrernate.entity.Product;

import java.util.List;

public class ProductService {
    private ProductDao productDao;

    public ProductService() {
        this.productDao = new ProductDao(new HibernateUtil());
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

    public int addProduct(int productId, String code, String name, int quantity, double price) {
        return productDao.addProduct(productId, code, name, quantity, price);
    }

}
