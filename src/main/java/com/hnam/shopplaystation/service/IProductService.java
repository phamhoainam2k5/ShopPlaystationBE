package com.hnam.shopplaystation.service;

import java.util.List;

import com.hnam.shopplaystation.entity.Product;

public interface IProductService {

    List<Product> getTop5SellingProducts();

    List<Product> getTop5SellingProductsByCategory(Long categoryId);

    List<Product> getAllProductsByCategoryId(Long categoryId);
}
