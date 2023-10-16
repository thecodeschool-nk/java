package com.thecodeschool.hibrernate.dao;

import com.thecodeschool.hibrernate.connection.HibernateUtil;
import com.thecodeschool.hibrernate.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private HibernateUtil hibernateUtil;
    private Session session;

    public ProductDao(HibernateUtil hibernateUtil) {
        this.hibernateUtil = hibernateUtil;
        this.session = hibernateUtil.getSession();
    }

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        try {
            productList = session.createQuery("from Product").getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public int updateProductPrice(int productId, double newPrice) {
        int count = 0;

        try {
            Product product = session.load(Product.class, productId);
            product.setPrice(newPrice);
            Transaction txn = session.beginTransaction();
            session.update(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int updateProductName(int productId, String name) {
        int count = 0;

        try {
            Product product = session.load(Product.class, productId);
            product.setName(name);
            Transaction txn = session.beginTransaction();
            session.update(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int updateProductQuantity(int productId, int quantity) {
        int count = 0;

        try {
            Product product = session.load(Product.class, productId);
            product.setQuantity(quantity);
            Transaction txn = session.beginTransaction();
            session.update(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int updateProductCode(int productId, String code) {
        int count = 0;

        try {
            Product product = session.load(Product.class, productId);
            product.setProductCode(code);
            Transaction txn = session.beginTransaction();
            session.update(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int deleteProduct(int productId) {
        int count = 0;

        try {
            Product product = session.load(Product.class, productId);
            Transaction txn = session.beginTransaction();
            session.delete(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int addProduct(int productId, String code, String name, int quantity, double price) {
        int count = 0;
        Product product = new Product();
        product.setProductId(productId);
        product.setName(name);
        product.setProductCode(code);
        product.setQuantity(quantity);
        product.setPrice(price);

        try {
            Transaction txn = session.beginTransaction();
            session.saveOrUpdate(product);
            txn.commit();
            count++;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }
}
