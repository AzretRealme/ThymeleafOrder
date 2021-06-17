package com.example.demo.Service.impl;

import com.example.demo.Service.CourierStatusService;

import com.example.demo.dao.CourierStatusRepo;
import com.example.demo.models.OrderStatus;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@AllArgsConstructor
public class CourierStatusServiceImpl implements CourierStatusService {

    @Autowired
    CourierStatusRepo courierStatusRepo;

}