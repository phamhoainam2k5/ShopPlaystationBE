package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.Category;

// REPOSITORY CỦA THỂ LOẠI SẢN PHẨM
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long>{
}
