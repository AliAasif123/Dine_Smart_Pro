package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.FoodOrder;

public interface FoodOrderService {
    FoodOrder addFoodOrder(FoodOrder foodOrder);
    FoodOrder updateFoodOrder(FoodOrder foodOrder);
    FoodOrder getFoodOrderById(int foodOrderId);
    void deleteFoodOrder(int foodOrderId);
    List<FoodOrder> getAllFoodOrders();
    FoodOrder addCartToFoodOrder(int cartId);
    List<FoodOrder> getFoodOrdersByCustomerId(int customerId);
    FoodOrder updateFoodOrderStatus(int orderId, int orderStatusId);
    List<FoodOrder> getAllFoodOrdersByOrderStatusId(int orderStatusId);
    List<FoodOrder> getAllFoodOrdersForChef();
}
