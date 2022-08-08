package com.fuel.fuelapplication.service;

import com.fuel.fuelapplication.model.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);
    List<Order> getAllOrders();
}
