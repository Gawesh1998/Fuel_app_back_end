package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Order;
import com.fuel.fuelapplication.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        if (order.getName().trim().equals(null) || order.getName().trim().equals(null)){
            throw new RuntimeException("Error: fuel station name is invalid");
        }
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
