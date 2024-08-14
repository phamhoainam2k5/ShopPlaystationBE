package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.User;

// REPOSITORY CỦA NGƯỜI DÙNG
@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    User findByPhone(String phone);
}
