package com.backendapp.dinesmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Cart;
import com.backendapp.dinesmart.Entities.FoodOrder;
import com.backendapp.dinesmart.Entities.OrderStatus;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {
    List<FoodOrder> findAllByOrderStatus(OrderStatus orderStatus);
    FoodOrder findFoodOrderByCart(Cart cart);
    boolean existsFoodOrderByCart(Cart cart);
}
