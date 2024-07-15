package com.hnam.shopplaystation.entity;

import jakarta.persistence.*;
import lombok.*;

// THÔNG TIN NGƯỜI DÙNG
@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TÊN ĐẦY ĐỦ CỦA KHÁCH
    private String name;

    // SỐ ĐIỆN THOẠI LIÊN LẠC CỦA KHÁCH CÓ THỂ DÙNG ĐỂ ĐĂNG NHẬP
    private String phone;
    
    // EMAIL CỦA KHÁCH DÙNG ĐỂ ĐĂNG NHẬP 
    private String email;

    // ĐỊA CHỈ GIAO HÀNG NẾU KHÁCH CÓ NHU CẦU ĐẶT HÀNG QUA MẠNG
    private String address;
    
    // LOẠI NGƯỜI DÙNG
    @Enumerated(EnumType.STRING)
    private UserType userType;
    
    public enum UserType {
        ADMIN,
        CUSTOMER
    }
}