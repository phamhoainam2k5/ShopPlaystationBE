package com.hnam.shopplaystation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{
    Role findByRoleName(String roleName);
}
