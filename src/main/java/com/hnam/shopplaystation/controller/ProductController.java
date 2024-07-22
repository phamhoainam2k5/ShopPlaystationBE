package com.hnam.shopplaystation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.hnam.shopplaystation.entity.Product;
import com.hnam.shopplaystation.service.imp.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/top-selling")
    public List<Product> getTop5SellingProducts() {
        return productService.getTop5SellingProducts();
    }

    @GetMapping("/top-selling/category/{categoryId}")
    public List<Product> getTop5SellingProductsByCategory(@PathVariable Long categoryId) {
        return productService.getTop5SellingProductsByCategory(categoryId);
    }
}
