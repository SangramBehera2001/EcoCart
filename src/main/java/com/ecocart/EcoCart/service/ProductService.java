package com.ecocart.EcoCart.service;

import com.ecocart.EcoCart.model.Product;
import java.util.List;
public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    void deleteProduct(Long id);
}
