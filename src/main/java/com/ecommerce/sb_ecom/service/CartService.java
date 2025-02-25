package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payload.CartDTO;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
