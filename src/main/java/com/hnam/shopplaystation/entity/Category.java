package com.hnam.shopplaystation.entity;

import jakarta.persistence.*;
import lombok.*;

// THỂ LOẠI CỦA SẢN PHẨM
@Entity @Table(name = "categories")
@AllArgsConstructor @NoArgsConstructor @Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TÊN THỂ LOẠI
    private String categoryName;
}