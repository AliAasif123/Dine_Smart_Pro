package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.OrderStatus;

public interface OrderStatusService {
    OrderStatus addOrderStatus(OrderStatus orderStatus);
    OrderStatus updateOrderStatus(OrderStatus orderStatus);
    void deleteOrderStatus(int orderStatusId);
    OrderStatus getOrderStatusById(int orderStatusId);
    List<OrderStatus> getAllOrderStatuses();
}
