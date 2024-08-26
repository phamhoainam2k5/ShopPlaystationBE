package com.hnam.shopplaystation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CartItemDTO {
    private Long productId;
    private String productName;
    private String productImage;
    private int productPrice;
    private int quantity;
}
