package com.hnam.shopplaystation.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

// THÔNG TIN SẢN PHẨM
@Entity @Table(name = "products")
@AllArgsConstructor @NoArgsConstructor @Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TÊN SẢN PHẨM
    private String productName;

    // ẢNH SẢN PHẨM
    private String thumbnailImage;

    // NGÀY SẢN XUẤT CỦA SẢN PHẨM
    private Date productionDate;

    // THƯƠNG HIỆU CỦA SẢN PHẨM
    private String brand;

    // THÔNG SỐ KỸ THUẬT CỦA SẢN PHẨM
    @Column(columnDefinition = "LONGTEXT")
    private String specifications;

    // MÔ TẢ SẢN PHẨM
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    
    // TRẠNG THÁI SẢN PHẨM
    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    
    // THỂ LOẠI SẢN PHẨM
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public enum ProductStatus {
        IN_STOCK,
        OUT_OF_STOCK
    }
}