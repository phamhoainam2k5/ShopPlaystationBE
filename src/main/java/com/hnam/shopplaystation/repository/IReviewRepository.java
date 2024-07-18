package com.hnam.shopplaystation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hnam.shopplaystation.entity.Review;

@Repository
public interface IReviewRepository extends JpaRepository<Review, Long> {
    
}
