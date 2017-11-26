package com.mkyong.web.services;

import com.mkyong.web.models.Product;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class ProductManagerImpl implements ProductManager{

    public List<Product> products;
    public Product product;
    public List<Product> getProducts() {
        return products;
    }

    public void increasePrice(int percentage) {
        if(products!=null){
            for(Product product:products){
                double price=product.getPrice()+2;
                product.setPrice(price);
            }
        }

    }

    public void setProducts(List<Product> products) {
        this.products=products;
    }
    public void addProduct(Product product){
        products.add(product);
    }

}
