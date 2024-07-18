package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.ShoppingCart;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
