package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.Product;

// REPOSITORY CỦA SẢN PHẨM
@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}