package com.hnam.shopplaystation.entity;

import jakarta.persistence.*;
import lombok.*;

// CHI TIẾT ĐƠN ĐẶT HÀNG
@Entity @Table(name = "order_item")
@AllArgsConstructor @NoArgsConstructor @Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // THÔNG TIN CÁC SẢN PHẨM TRONG ĐƠN ĐẶT HÀNG CỦA KHÁCH
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // SỐ LƯỢNG SẢN PHẨM MÀ KHÁCH MUỐN ĐẶT
    private int quantity;

    // GIÁ CẢ
    private double price;

    // LẤY THÔNG TIN ĐƠN HÀNG
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
