package com.hnam.shopplaystation.entity;

import java.util.Date;

import lombok.*;
import jakarta.persistence.*;

// ĐÁNH GIÁ
@Entity @Table(name = "review")
@Data @AllArgsConstructor @NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // LẤY THÔNG TIN NGƯỜI DÙNG
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // LẤY THÔNG TIN SẢN PHẨM
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // ĐIỂM ĐÁNH GIÁ
    private int rating;

    // NỘI DUNG ĐÁNH GIÁ
    private String content;

    // THỜI GIAN ĐÁNH GIÁ ĐƯỢC GỬI
    private Date timestamp;
}
