package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Cart;

public interface CartService {
    Cart addCart(Cart cart);
    Cart updateCart(Cart cart);
    Cart getCartByCartId(int cartId);
    List<Cart> getAllCarts();
    void deleteCart(int cartId);
    Cart addFoodAndCustomerToCart(int foodId, int customerId, int cartQuantity);
    List<Cart> getAllCartsByCustomerId(int customerId);
    Cart updateCartOrderedStatus(int cartId, boolean cartOrderedStatus);
}
