package com.ecocart.EcoCart.repository;

import com.ecocart.EcoCart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
