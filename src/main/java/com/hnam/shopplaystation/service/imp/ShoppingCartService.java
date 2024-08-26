package com.hnam.shopplaystation.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnam.shopplaystation.dto.CartItemDTO;
import com.hnam.shopplaystation.entity.CartItem;
import com.hnam.shopplaystation.entity.Product;
import com.hnam.shopplaystation.entity.ShoppingCart;
import com.hnam.shopplaystation.entity.User;
import com.hnam.shopplaystation.repository.ICartItemRepository;
import com.hnam.shopplaystation.repository.IShoppingCartRepository;
import com.hnam.shopplaystation.service.IShoppingCartService;

@Service
public class ShoppingCartService implements IShoppingCartService{

    @Autowired
    private IShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ICartItemRepository cartItemRepository;

    public List<CartItemDTO> findCartItemsByUserId(Long userId) {
        return cartItemRepository.findCartItemsByUserId(userId);
    }
}
