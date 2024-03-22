package com.example.order.controller;

import com.example.order.model.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/order")
    public String getOrder() {
        return "Get all order";
    }


    @PostMapping("/saveOrder")
    public Order addOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }


}
