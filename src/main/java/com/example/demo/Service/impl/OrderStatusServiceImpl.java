package com.example.demo.Service.impl;

import com.example.demo.Service.OrderStatusService;
import com.example.demo.dao.OrderStatusRepo;
import com.example.demo.models.OrderStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusRepo orderStatusRepo;

    @Override
    public List<OrderStatus> findAll() {
        return orderStatusRepo.findAll();
    }
}
