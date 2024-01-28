package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Cart;
import com.backendapp.dinesmart.Entities.Customer;
import com.backendapp.dinesmart.Entities.Food;
import com.backendapp.dinesmart.repositories.CartRepository;
import com.backendapp.dinesmart.service.CartService;
import com.backendapp.dinesmart.service.CustomerService;
import com.backendapp.dinesmart.service.FoodService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private FoodService foodService;

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart getCartByCartId(int cartId) {
        return cartRepository.findById(cartId).get();
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteCart(int cartId) {
        cartRepository.deleteById(cartId);
    }

    @Override
    public Cart addFoodAndCustomerToCart(int foodId, int customerId, int cartQuantity) {
        Customer customer = customerService.getCustomerByCustomerId(customerId);
        Food food = foodService.getFoodByFoodId(foodId);
        Cart cart = new Cart();
        cart.setCustomer(customer);
        cart.setFood(food);
        cart.setCartQuantity(cartQuantity);

        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCartsByCustomerId(int customerId) {
        Customer customer = customerService.getCustomerByCustomerId(customerId);
        List<Cart> cartList =  cartRepository.findCartsByCustomer(customer);
        cartList.removeIf(Cart::isCartOrderedStatus);
        return cartList;
    }

    @Override
    public Cart updateCartOrderedStatus(int cartId, boolean cartOrderedStatus) {
        Cart cart = cartRepository.findById(cartId).get();
        cart.setCartOrderedStatus(cartOrderedStatus);
        return cartRepository.save(cart);
    }
}
