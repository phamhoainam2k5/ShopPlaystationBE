package com.hnam.shopplaystation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.dto.CartItemDTO;
import com.hnam.shopplaystation.entity.CartItem;
import com.hnam.shopplaystation.entity.ShoppingCart;

// REPOSITORY CỦA CHI TIẾT GIỎ HÀNG
@Repository
public interface ICartItemRepository extends JpaRepository<CartItem, Long> {
    @Query("SELECT new com.hnam.shopplaystation.dto.CartItemDTO(p.id, p.productName, p.thumbnailImage, p.price, ci.quantity) " +
            "FROM CartItem ci JOIN ci.product p JOIN ci.shoppingCart sc " +
            "WHERE sc.user.id = :userId")
    List<CartItemDTO> findCartItemsByUserId(@Param("userId") Long userId);
}
