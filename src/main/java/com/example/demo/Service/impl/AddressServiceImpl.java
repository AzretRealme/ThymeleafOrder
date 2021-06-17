package com.example.demo.Service.impl;

import com.example.demo.Service.AddressService;
import com.example.demo.dao.AddressRepo;
import com.example.demo.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }
}
