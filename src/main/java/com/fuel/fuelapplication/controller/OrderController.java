package com.fuel.fuelapplication.controller;

import com.fuel.fuelapplication.model.Order;
import com.fuel.fuelapplication.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @PostMapping("/add")
    public ResponseEntity<Order> save (@RequestBody Order order){
        return new ResponseEntity<>(orderService.save(order), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public List<Order> getAll(){
        return orderService.getAllOrders();
    }




}
