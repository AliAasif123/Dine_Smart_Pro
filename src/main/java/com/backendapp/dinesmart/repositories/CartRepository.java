package com.backendapp.dinesmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Cart;
import com.backendapp.dinesmart.Entities.Customer;
import com.backendapp.dinesmart.Entities.FoodOrder;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findCartByFoodOrder(FoodOrder foodOrder);
    List<Cart> findCartsByCustomer(Customer customer);
}
