package com.example.demo.Service.impl;

import com.example.demo.Service.AdminService;

import com.example.demo.dao.AdminRepo;
import com.example.demo.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public List<Admin> findAll() {
        return adminRepo.findAll();

    }
}