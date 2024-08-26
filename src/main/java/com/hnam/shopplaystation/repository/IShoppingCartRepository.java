package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.ShoppingCart;
import com.hnam.shopplaystation.entity.User;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
