package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.hnam.shopplaystation.entity.Product;

// REPOSITORY CỦA SẢN PHẨM
@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    // Lấy 5 sản phẩm bán chạy nhất
    @Query("SELECT p FROM Product p ORDER BY p.numberOfProductsSold DESC")
    List<Product> findTop5ByOrderByNumberOfProductsSoldDesc();

    // Lấy 5 sản phẩm bán chạy nhất theo thể loại
    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId ORDER BY p.numberOfProductsSold DESC")
    List<Product> findTop5ByCategoryIdOrderByNumberOfProductsSoldDesc(@Param("categoryId") Long categoryId);

    List<Product> findByCategoryId(Long categoryId);
}
