package com.example.demo.Service.impl;

import com.example.demo.Service.OrderService;

import com.example.demo.dao.OrderRepo;
import com.example.demo.models.Order;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }
}
