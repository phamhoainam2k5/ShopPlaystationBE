package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.Order;

// REPOSITORY CỦA ĐƠN HÀNG
@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
}