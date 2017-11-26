package com.mkyong.web.services;

import com.mkyong.web.models.Product;

import java.util.List;

public interface ProductManager {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

    public void addProduct(Product product);

    public void setProducts(List<Product> products);
}
