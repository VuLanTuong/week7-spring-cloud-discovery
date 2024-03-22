package com.example.order.service;

import com.example.order.model.Order;
import com.example.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

//    public String getAllOrder(){
//        return "get all order";
//
//    }

//    public String getOrderById(){
//        return "get order by id";
//
//    }

    public Order saveOrder(Order order){
        return  orderRepository.save((order));
    }
}
