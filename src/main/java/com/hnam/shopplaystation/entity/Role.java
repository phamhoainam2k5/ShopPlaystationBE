package com.hnam.shopplaystation.entity;

import jakarta.persistence.*;
import lombok.*;

// THỂ LOẠI NGƯỜI DÙNG
@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TÊN THỂ LOẠI NGƯỜI DÙNG
    private String roleName;
}
