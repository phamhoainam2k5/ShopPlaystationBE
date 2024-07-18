package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnam.shopplaystation.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{
    
}
