package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.OrderStatus;
import com.backendapp.dinesmart.repositories.OrderStatusRepository;
import com.backendapp.dinesmart.service.OrderStatusService;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Override
    public OrderStatus addOrderStatus(OrderStatus orderStatus) {
        return orderStatusRepository.save(orderStatus);
    }

    @Override
    public OrderStatus updateOrderStatus(OrderStatus orderStatus) {
        return orderStatusRepository.save(orderStatus);
    }

    @Override
    public void deleteOrderStatus(int orderStatusId) {
        orderStatusRepository.deleteById(orderStatusId);
    }

    @Override
    public OrderStatus getOrderStatusById(int orderStatusId) {
        return orderStatusRepository.findById(orderStatusId).get();
    }

    @Override
    public List<OrderStatus> getAllOrderStatuses() {
        return orderStatusRepository.findAll();
    }

}
