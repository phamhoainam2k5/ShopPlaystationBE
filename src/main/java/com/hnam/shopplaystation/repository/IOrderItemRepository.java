package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.OrderItem;

@Repository
public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
