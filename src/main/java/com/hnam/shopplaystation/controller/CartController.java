package com.hnam.shopplaystation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.hnam.shopplaystation.dto.CartItemDTO;
import com.hnam.shopplaystation.service.imp.ShoppingCartService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cart")
public class CartController {
    
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/{userId}/items")
    public ResponseEntity<List<CartItemDTO>> getCartItems(@PathVariable Long userId) {
        List<CartItemDTO> cartItems = shoppingCartService.findCartItemsByUserId(userId);
        return ResponseEntity.ok(cartItems);
    }
}
