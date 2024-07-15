package com.hnam.shopplaystation.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

// GIỎ HÀNG
@Entity @Table(name = "shopping_cart")
@AllArgsConstructor @NoArgsConstructor @Data
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // THÔNG TIN CỦA NGƯỜI DÙNG ĐỂ CÓ THỂ LẤY THÔNG TIN GIỎ HÀNG
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // CHI TIẾT SẢN PHẨM TRONG GIỎ HÀNG
    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems;
}
