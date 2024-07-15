package com.hnam.shopplaystation.entity;

import jakarta.persistence.*;
import lombok.*;

// CHI TIẾT GIỎ HÀNG
@Entity @Table(name = "cart_item")
@AllArgsConstructor @NoArgsConstructor @Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // SẢN PHẨM TRONG GIỎ HÀNG
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // SỐ LƯỢNG SẢN PHẨM TRONG GIỎ HÀNG
    private int quantity;

    // KẾT NỐI ĐẾN BẢNG GIỎ HÀNG
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private ShoppingCart shoppingCart;
}
