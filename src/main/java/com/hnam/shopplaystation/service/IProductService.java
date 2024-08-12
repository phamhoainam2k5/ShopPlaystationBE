package com.hnam.shopplaystation.service;

import java.util.List;
import java.util.Optional;

import com.hnam.shopplaystation.entity.Product;

public interface IProductService {

    List<Product> getTop5SellingProducts();

    List<Product> getTop5SellingProductsByCategory(Long categoryId);

    List<Product> getAllProductsByCategoryId(Long categoryId);

    Optional<Product> getProductById(Long id);
}
