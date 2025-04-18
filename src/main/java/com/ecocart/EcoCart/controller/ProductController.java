package com.ecocart.EcoCart.controller;

import com.ecocart.EcoCart.model.Product;
import com.ecocart.EcoCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String productPage(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products); //Sends list to HTML page
        return "products"; //loads products.html page
    }
}
