package com.hnam.shopplaystation.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnam.shopplaystation.entity.Product;
import com.hnam.shopplaystation.repository.IProductRepository;
import com.hnam.shopplaystation.service.IProductService;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getTop5SellingProducts() {
        return productRepository.findTop5ByOrderByNumberOfProductsSoldDesc().stream().limit(5).toList();
    }

    @Override
    public List<Product> getTop5SellingProductsByCategory(Long categoryId) {
        return productRepository.findTop5ByCategoryIdOrderByNumberOfProductsSoldDesc(categoryId).stream().limit(5).toList();
    }

    @Override
    public List<Product> getAllProductsByCategoryId(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
