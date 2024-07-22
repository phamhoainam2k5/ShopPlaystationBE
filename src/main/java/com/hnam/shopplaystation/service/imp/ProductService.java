package com.hnam.shopplaystation.service.imp;

import java.util.List;

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
        return productRepository.findTop5ByOrderByNumberOfProductsSoldDesc();
    }

    @Override
    public List<Product> getTop5SellingProductsByCategory(Long categoryId) {
        return productRepository.findTop5ByCategoryIdOrderByNumberOfProductsSoldDesc(categoryId);
    }
    
}
