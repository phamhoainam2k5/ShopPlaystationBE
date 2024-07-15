package com.hnam.shopplaystation.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

// ĐƠN ĐẶT HÀNG
@Entity @Table(name = "orders")
@AllArgsConstructor @NoArgsConstructor @Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // THÔNG TIN KHÁCH HÀNG
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // SẢN PHẨM KHÁCH ĐẶT HÀNG
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    // SỐ TIỀN CẦN THANH TOÁN
    private double totalAmount;
    
    // TRẠNG THÁI CỦA ĐƠN HÀNG
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public enum OrderStatus {
        PROCESSING,
        DELIVERED,
        CANCELED
    }
}
