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

    // PASSWORD ĐỂ ĐĂNG NHẬP VÀO TÀI KHOẢN
    private String password;

    // ĐỊA CHỈ GIAO HÀNG NẾU KHÁCH CÓ NHU CẦU ĐẶT HÀNG QUA MẠNG
    private String address;
    
    // LOẠI NGƯỜI DÙNG
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}