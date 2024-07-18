package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.CartItem;

// REPOSITORY CỦA CHI TIẾT GIỎ HÀNG
@Repository
public interface ICartItemRepository extends JpaRepository<CartItem, Long> {
}
